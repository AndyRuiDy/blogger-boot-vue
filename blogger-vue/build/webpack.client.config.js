const path = require('path')
const VueLoaderPlugin = require('vue-loader/lib/plugin')
const HtmlWebpackPlugin = require('html-webpack-plugin')
const webpack = require('webpack')
const baseConfig = require('./webpack.base.config')
const merge = require('webpack-merge')
const MiniCssExtractPlugin = require('mini-css-extract-plugin')

const isDev = process.env.NODE_ENV === 'development'

const devServer = {
  port: 8010,
  host: '0.0.0.0', // 方便本机、内网、手机等访问
  overlay: {
    errors: true
  },
  historyApiFallback: {
    index: '/index.html'
  },
  hot: true // 热加载
}

const defaultPlugin = [
  new VueLoaderPlugin(),
  new webpack.DefinePlugin({
    'process.env': {
      NODE_ENV: isDev ? '"development"' : '"production"'
    }
  }),
  new HtmlWebpackPlugin({
    template: path.resolve(__dirname, 'template.html')
  })
]

let config

if (isDev) {
  config = merge(baseConfig, {
    devtool: '#cheap-module-eval-source-map',
    module: {
      rules: [
        {
          test: /\.styl(us)?$/,
          use: [
            'vue-style-loader',
            'css-loader',
            {
              loader: 'postcss-loader',
              options: {
                sourceMap: true
              }
            },
            'stylus-loader'
          ]
        }
      ]
    },
    devServer,
    plugins: defaultPlugin.concat([
      new MiniCssExtractPlugin({
        filename: '[name].[hash:8].css'
      })
    ])
  })
} else {
  config = merge(baseConfig, {
    entry: path.resolve(__dirname, '../client/index.js'),
    output: {
      filename: 'bundle.[chunkHash:8].js'
    },
    module: {
      rules: [
        {
          test: /\.styl(us)?$/,
          use: [
            MiniCssExtractPlugin.loader,
            'css-loader',
            {
              loader: 'postcss-loader',
              options: {
                sourceMap: true
              }
            },
            'stylus-loader'
          ]
        }
      ]
    },
    plugins: defaultPlugin.concat([
      new MiniCssExtractPlugin({
        filename: '[name].[chunkHash:8].css'
      })
    ]),
    optimization: { // 提取公共模块
      splitChunks: {
        cacheGroups: { // 设置缓存组
          commons: {
            chunks: 'initial',
            minChunks: 2, // 在分割模块之前共享模块的最小块数(默认是1)
            maxInitialRequests: 5, // 入口点上的最大并行请求数(默认是3)
            minSize: 0
          },
          vendor: {
            test: /[\\/]node_modules[\\/]/,
            chunks: 'initial',
            name: 'vendor',
            priority: 10,
            enforce: true
          },
          styles: {
            name: 'styles',
            test: /\.css$/,
            chunks: 'all',
            enforce: true
          }
        }
      },
      runtimeChunk: true
    }
  })
}

module.exports = config

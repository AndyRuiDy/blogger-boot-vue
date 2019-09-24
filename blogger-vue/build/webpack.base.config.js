const path = require('path')
const VueLoaderOptions = require('./vue-loader')

const isDev = process.env.NODE_ENV === 'development'

function resolve (dir) {
  return path.join(__dirname, '..', dir)
}

const config = {
  entry: path.resolve(__dirname, '../client/client-entry.js'), // 入口js文件
  output: { // webpack打包输出js文件的路径及文件名
    filename: 'bundle.[hash:8].js',
    path: path.resolve(__dirname, '../public'),
    publicPath: 'http://127.0.0.1:8010/public/'
  },
  resolve: {
    extensions: ['.js', '.vue', '.json'],
    alias: {
      'vue$': 'vue/dist/vue.esm.js',
      '@': resolve('client')
    }
  },
  mode: process.env.NODE_ENV || 'production', // 判断其环境
  module: {
    rules: [
      {
        test: /\.(vue|js|jsx)$/,
        loader: 'eslint-loader',
        exclude: /node_modules/,
        enforce: 'pre'
      },
      {
        test: /\.vue$/,
        loader: 'vue-loader',
        options: VueLoaderOptions(isDev)
      },
      {
        test: /\.css$/,
        use: [
          'vue-style-loader',
          'css-loader'
        ]
      },
      {
        test: /\.jsx$/,
        loader: 'babel-loader'
      },
      {
        test: /\.js$/,
        loader: 'babel-loader',
        exclude: /node_modules/ // babel-loader会去转译node_modules目录或者其他不需要的源代码, 所以需要排除node_modules
      },
      {
        test: /\.(png|jpe?g|gif|svg)(\?.*)?$/,
        loader: 'url-loader',
        options: {
          limit: 10000,
          name: 'resources/img/[path][name].[ext]'
        }
      },
      {
        test: /\.(mp4|webm|ogg|mp3|wav|flac|aac)(\?.*)?$/,
        loader: 'url-loader',
        options: {
          limit: 10000,
          name: 'resources/media/[path][name].[ext]'
        }
      },
      {
        test: /\.(woff2?|eot|ttf|otf)(\?.*)?$/,
        loader: 'url-loader',
        options: {
          limit: 80000,
          name: 'resources/fonts/[path][name].[ext]'
        }
      }
    ]
  }
}

module.exports = config

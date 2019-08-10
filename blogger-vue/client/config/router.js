import Router from 'vue-router'
import routes from './routes'

// 避免内存溢出
export default () => {
  return new Router({
    routes,
    mode: 'history'
  })
}

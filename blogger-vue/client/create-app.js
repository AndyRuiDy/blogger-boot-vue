import Vue from 'vue'
import VueRouter from 'vue-router'
import VueMeta from 'vue-meta'
import ElementUI from 'element-ui'
import App from './app.vue'
import createRouter from './config/router'

import './assets/styles/global.styl'
import 'element-ui/lib/theme-chalk/index.css'
import './assets/styles/border.css'
import './assets/styles/reset.css'

Vue.use(VueRouter)
Vue.use(VueMeta)
Vue.use(ElementUI)

export default () => {
  const router = createRouter()

  const app = new Vue({
    router,
    render: h => h(App)
  })

  return { app, router }
}

import Vue from 'vue'
import App from './app.vue'
import VueRouter from 'vue-router'
import ElementUI from 'element-ui'

import './assets/styles/global.styl'
import 'element-ui/lib/theme-chalk/index.css'
import './assets/styles/border.css'
import './assets/styles/reset.css'
import createRouter from './config/router'

Vue.use(VueRouter)
Vue.use(ElementUI)

const router = createRouter()

new Vue({
  router,
  render: (h) => h(App)
}).$mount('#root')

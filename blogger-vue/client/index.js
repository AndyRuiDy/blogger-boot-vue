import Vue from 'vue'
import App from './app.vue'
import VueRouter from 'vue-router'
import ElementUI from 'element-ui'
import { library } from '@fortawesome/fontawesome-svg-core'
import { fas } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'

import './assets/styles/global.styl'
import 'element-ui/lib/theme-chalk/index.css'
import './assets/styles/border.css'
import './assets/styles/reset.css'
import createRouter from './config/router'

Vue.use(VueRouter)
Vue.use(ElementUI)

const router = createRouter()

library.add(fas)

Vue.component('font-awesome-icon', FontAwesomeIcon)

Vue.config.productionTip = false

new Vue({
  router,
  render: (h) => h(App)
}).$mount('#root')

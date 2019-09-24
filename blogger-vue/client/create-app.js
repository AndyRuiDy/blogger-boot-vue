import Vue from 'vue'
import VueRouter from 'vue-router'
import VueMeta from 'vue-meta'
import ElementUI from 'element-ui'
import App from './app.vue'
import createRouter from './config/router'
import { library } from '@fortawesome/fontawesome-svg-core'
import { fas } from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'

import './assets/styles/global.styl'
import 'element-ui/lib/theme-chalk/index.css'
import './assets/styles/border.css'
import './assets/styles/reset.css'

Vue.use(VueRouter)
Vue.use(VueMeta)
Vue.use(ElementUI)

library.add(fas)

Vue.component('font-awesome-icon', FontAwesomeIcon)

Vue.config.productionTip = false

export default () => {
  const router = createRouter()

  const app = new Vue({
    router,
    render: h => h(App)
  })

  return { app, router }
}

export default [
  {
    path: '/',
    redirect: '/login'
  },
  {
    path: '/login',
    component: () => import('../views/login/login.vue')
  },
  {
    path: '/main',
    component: () => import('../views/main/main.vue')
  },
  {
    path: '/layout',
    component: () => import('../views/layout/layout.vue')
  }
]

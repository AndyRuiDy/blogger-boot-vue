<template>
  <div class="blog-wrapper">
    <div />
    <sidebar class="blog-siderbar-container" />
    <div class="blog-main-container">
      <navbar />
      <tags-view />
      <blog-main />
    </div>
  </div>
</template>

<script>
import { Sidebar, Navbar, TagsView, BlogMain } from './components'

export default {
  components: {
    Sidebar,
    Navbar,
    TagsView,
    BlogMain
  }
}
</script>

<style>
.el-scrollbar{
  position: fixed;
}
</style>

<style lang="stylus" scoped>
.blog-wrapper
  height 100%
  overflow hidden
</style>

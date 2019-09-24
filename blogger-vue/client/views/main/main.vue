<template>
  <el-container>
    <el-header class="h-box">
      <blog-header />
    </el-header>
    <el-container>
      <el-aside class="h-aside">
        <blog-aside />
      </el-aside>
      <el-main class="h-main">
        <blog-main />
      </el-main>
      <!-- <el-container>
        <el-main class="h-main">
        <blog-main />
        </el-main>
        <el-footer>Footer</el-footer>
      </el-container> -->
    </el-container>
  </el-container>
</template>

<script>
import BlogHeader from './components/header.vue'
import BlogAside from './components/aside.vue'
import BlogMain from './components/home.vue'

export default {
  components: {
    BlogHeader,
    BlogAside,
    BlogMain
  }
}
</script>

<style lang="stylus" scoped>
.h-box
  background #39669d
.h-aside
  width 200px
  height 840px
  border 1px solid red
.h-main
  padding 0
</style>

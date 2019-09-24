<template>
  <el-scrollbar wrap-class="blog-scrollbar">
    <el-menu
      mode="vertical"
      background-color="#304156"
      text-color="#bfcbd9"
      active-text-color="#409EFF"
    >
      <div class="blog-avge">
        <img
          class="blog-circle img"
          src="../../../../assets/images/avater.jpg"
          alt=""
          width="80"
          height="80"
        >
      </div>
      <sidebar-item />
    </el-menu>
  </el-scrollbar>
</template>

<script>
import SidebarItem from './sidebaritem'

export default {
  name: 'Sidebar',
  components: {
    SidebarItem
  }
}
</script>

<style lang="stylus" scoped>
.blog-avge
  width 100%
  height 90px
  padding-top 20px
  text-align center
  color #fff
  .blog-name
    height 30px
    border 1px solid blue
</style>

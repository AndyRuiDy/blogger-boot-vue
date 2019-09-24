<template>
  <el-breadcrumb class="blog-breadcrumd" separator="/">
    <el-breadcrumb-item>
      <span class="no-redirect">首页</span>
      <router-link to="">/ 导航一</router-link>
    </el-breadcrumb-item>
  </el-breadcrumb>
</template>

<script>
export default {
  name: 'Breadcrumb'
}
</script>

<style lang="stylus" scoped>
.blog-breadcrumd.el-breadcrumb
  display inline-block
  font-size 14px
  line-height 50px
  margin-left 10px
  .no-redirect
    color #97a8be
    cursor text
</style>

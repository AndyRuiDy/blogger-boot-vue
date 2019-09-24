<template>
  <div class="blog-header">
    <div class="blog-header-box">
      <div class="blog-header-title">
        <p>XXX博客系统</p>
      </div>
      <div class="blog-header-user" />
    </div>
  </div>
</template>

<script>
export default {
  name: 'BlogHeader'
}
</script>

<style lang="stylus" scoped>
.blog-header
  height 100%
  .blog-header-box
    width 92%
    height 60px
    margin 0 auto
    .blog-header-title
      width 30%
      height 60px
      font-size 24px
      display inline-block
      float left
      p
        height 60px
        display table-cell
        vertical-align middle
        letter-spacing 6px
        color #fff
    .blog-header-user
      display inline-block
      float right
      width 30%
      height 60px
</style>

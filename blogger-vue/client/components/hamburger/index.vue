<template>
  <div style="outline: none;">
    <span class="el-icon-s-unfold hamburger" />
  </div>
</template>

<script>
export default {
  name: 'Humburger'
}
</script>

<style lang="stylus" scoped>
.hamburger
  display inline-block
  width 20px
  height 20px
  font-size 22px
  transition .38s
  transform-origin 50% 50%
  .is-active
    transform rotate(0deg)
</style>

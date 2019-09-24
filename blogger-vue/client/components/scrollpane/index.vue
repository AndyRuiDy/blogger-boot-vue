<template>
  <div class="blog-scroll-container">
    <div class="scroll-wrapper" :style="{left: left + 'px'}">
      <slot></slot>
    </div>
  </div>
</template>

<script>
export default {
  name: 'ScrollPane',
  data () {
    return {
      left: 0
    }
  }
}
</script>

<style lang="stylus" scoped>
.blog-scroll-container
  white-space nowrap
  position relative
  overflow hidden
  width 100%
  .scroll-wrapper
    position absolute

</style>

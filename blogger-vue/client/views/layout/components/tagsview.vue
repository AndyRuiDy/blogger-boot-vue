<template>
  <div>
    <scroll-pane class="tags-view-wrapper">
      <router-link to="" class="tags-view-item">
        首页
        <span class="el-icon-close"></span>
      </router-link>
    </scroll-pane>
    <ul class="contextmenu" v-show="visible" :style="{left: left + 'px',top: top + 'px'}">
      <li>关闭</li>
      <li>关闭其他</li>
      <li>关闭所有</li>
    </ul>
  </div>
</template>

<script>
import ScrollPane from '@/components/scrollpane'

export default {
  name: 'TagsView',
  components: {
    ScrollPane
  },
  data () {
    return {
      visible: false,
      left: 0,
      top: 0
    }
  }
}
</script>

<style lang="stylus" scoped>
.tags-view-wrapper
  background #fff
  height 34px
  border-bottom 1px solid #d8dce5
  box-shadow 0 1px 3px 0 rgba(0, 0, 0, .12), 0 0 3px 0 rgba(0, 0, 0, .04)
  .tags-view-item
    display inline-block
    position relative
    height 26px
    line-height 26px
    border 1px solid #d8dce5
    color #495060
    background #fff
    padding 0 8px
    font-size 12px
    margin-left 5px
    margin-top 4px
</style>

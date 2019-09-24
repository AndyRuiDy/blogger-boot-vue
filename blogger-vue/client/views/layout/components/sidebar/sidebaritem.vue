<template>
  <div class="menu-wrapper">
    <template>
      <router-link to="">
        <el-menu-item>
          <font-awesome-icon class="blog-icon" :icon="['fas', 'home']" />
          <span slot="title">首页</span>
        </el-menu-item>
      </router-link>

      <el-submenu index="1">
        <template slot="title">
          <i class="el-icon-location" />
          <span slot="title">导航二</span>
        </template>

        <router-link to="">
          <el-menu-item index="1-1">
            <i class="el-icon-location" />
            <span slot="title">导航三</span>
          </el-menu-item>
        </router-link>
      </el-submenu>

      <el-submenu index="2">
        <template slot="title">
          <i class="el-icon-location" />
          <span slot="title">导航二</span>
        </template>

        <router-link to="">
          <el-menu-item index="2-1">
            <i class="el-icon-location" />
            <span slot="title">导航三</span>
          </el-menu-item>
        </router-link>
      </el-submenu>
    </template>
  </div>
</template>

<script>
export default {
  name: 'SidebarItem'
}
</script>

<style lang="stylus" scoped>

</style>

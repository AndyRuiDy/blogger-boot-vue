<template>
  <div id="root">
    <router-view />
    <div
      id="login_form"
      class="mid_box"
    >
      <div class="form_head">
        <h1 style>
          <i class="el-icon-message-solid" /> Yg Login
        </h1>
      </div>
      <div class="form_body">
        <el-form
          ref="form"
          label-width="80px"
        >
          <el-form-item label="账号">
            <el-input
              v-model="id"
              placeholder="请输入账号"
            />
          </el-form-item>
          <el-form-item label="密码">
            <el-input
              v-model="password"
              placeholder="请输入密码"
              show-password
            />
          </el-form-item>
          <el-form-item>
            <el-button
              class="button"
              type="success"
            >
              登录
            </el-button>

            <el-button
              class="button"
              type="info"
            >
              <!-- <router-link
                :to="{name:'Resign'}"
                class="res"
              > -->
              注册
              <!-- </router-link> -->
            </el-button>
          </el-form-item>
        </el-form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  metaInfo: {
    title: 'login'
  },
  data () {
    return {
      id: '',
      password: ''
    }
  }
}
</script>

<style lang="stylus" scoped>
.mid_box
  width 500px
  height 400px
  background:rgba(255, 255, 255, 0.5)
  position absolute
  left 50%
  top 50%
  transform translate(-50%,-50%)
h1
  text-align center
  position relative
  top 30px
  font 30px Extra large

.form_head
  width 500px
  margin 0px auto
  height 90px
  background #39669d

.form_body
  position absolute
  top 145px
  left 8px

.button
  width 180px
  background #39669d
  .res
    color #fff
</style>

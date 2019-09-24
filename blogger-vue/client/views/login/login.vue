<template>
  <div id="login">
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

            <router-link
              :to="{path: '/layout'}"
              class="res"
            >
              <el-button
                class="button"
                type="info"
              >
                注册
              </el-button>
            </router-link>
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
#login
  width 100%
  height 100%
  min-height 943px
  background-image url('../../assets/images/blogger-1.jpg')
  background-size: 100% 100%
  background-position center
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

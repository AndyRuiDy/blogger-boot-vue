<template>
  <div id="root">
    <router-view />
    <div
      id="login_form"
      class="mid_box"
    >
      <div
        class="form_head"
        style="width:500px;"
      >
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
              <router-link :to="{name:'Resign'}">
                注册
              </router-link>
            </el-button>
          </el-form-item>
        </el-form>
      </div>
    </div>
  </div>
</template>

<script>
export default {
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
  background-color white
  margin 0 auto
  position relative
  top 300px

h1
  text-align center
  position relative
  top 30px
  font 30px Extra large

.form_head
  margin 0px auto
  height 100px
  background #199262

.form_body
  position relative
  top 45px
  padding 20px

.button
  width 180px
</style>

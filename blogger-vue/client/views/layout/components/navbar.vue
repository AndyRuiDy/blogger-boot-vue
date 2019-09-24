<template>
  <el-menu class="navbar" mode="horizontal">
    <!-- 控制左侧菜单缩进与伸展 -->
    <humburger class="blog-humburger-container" />
    <!-- 导航面包屑 -->
    <breadcrumb />

    <div class="blog-right-menu">
      <div class="blog-inline-block">
        <span>账号：</span><el-tag style="margin-right: 20px;">adminZhu</el-tag>
        <span>角色：</span>
        <el-tag style="margin-right: 15px;" type="danger" >游客（未配置任何角色）</el-tag>
      </div>
      <el-dropdown class="blog-inline-block blog-dropdown" trigger="click">
        <span>
          更多菜单<i class="el-icon-arrow-down el-icon--right"></i>
        </span>
        <el-dropdown-menu slot="dropdown">
          <el-dropdown-item>
            <i class="el-icon-s-home"></i>
            首页
          </el-dropdown-item>
          <el-dropdown-item>
            <i class="el-icon-user"></i>
            <span @click="handleCentor" style="display: inline-block">个人中心</span>
          </el-dropdown-item>
          <!-- <el-dropdown-item>主题色</el-dropdown-item> -->
          <el-dropdown-item>
            <i class="el-icon-setting"></i>
            <span @click="handleUpdatePwd" style="display: inline-block">修改密码</span>
          </el-dropdown-item>
          <el-dropdown-item divided>
            <i class="el-icon-switch-button"></i>
            退出
          </el-dropdown-item>
        </el-dropdown-menu>
      </el-dropdown>
    </div>

    <!-- 弹出窗口：修改密码 -->
    <el-dialog title="修改密码" :visible.sync="dialogVisible" width="30%">
      <el-form :rules="rules" ref="dataForm" :model="temp" label-position="right" label-width="100px">
        <el-form-item label="密码：" prop="pwd">
          <el-input type="password" v-model="temp.pwd" />
        </el-form-item>

        <el-form-item label="确认密码：" prop="pwd">
          <el-input type="password" v-model="temp.pwd2" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogVisible = false">取消</el-button>
        <el-button type="primary" @click="updatePwd">确定</el-button>
      </div>
    </el-dialog>

    <!-- 弹出窗口：个人中心 -->
    <el-dialog title="个人中心" :visible.sync="dialogCentor" width="40%">
      <div class="blog-centor-container">
        <div class="blog-centor-form">
          <el-form label-position="top" label-width="80px">
            <el-form-item label="昵称">
              <el-input type="text" placeholder="给自己起个名字" />
            </el-form-item>
            <el-form-item label="Bio">
              <el-input type="textarea" placeholder="You are not alone." />
            </el-form-item>
          </el-form>
        </div>
        <div class="blog-centor-img">
          <div class="blog-avge">
            <img
              class="blog-circle img"
              src="../../../assets/images/avater.jpg"
              alt=""
              width="140"
              height="140"
            >
          </div>
        </div>
        <div style="clear:both;"></div>
      </div>
      <div slot="footer" class="dialog-footer">
        <el-button @click="dialogCentor = false">取消</el-button>
        <el-button type="primary">确定</el-button>
      </div>
    </el-dialog>
  </el-menu>
</template>

<script>
import Humburger from '@/components/hamburger'
import Breadcrumb from '@/components/breadcrumb'

export default {
  name: 'Navbar',
  components: {
    Humburger,
    Breadcrumb
  },
  data () {
    let validatePwd = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请输入密码'))
      } else {
        // 校验确认密码
        if (this.temp.pwd2 !== '') {
          this.$refs.dataForm.validateField('pwd2')
        }
        callback()
      }
    }

    let validatePwd2 = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请重新输入密码'))
      } else if (value !== this.temp.pwd) {
        callback(new Error('密码不一致，请重新输入'))
      } else {
        callback()
      }
    }

    return {
      dialogCentor: false,
      dialogVisible: false,
      temp: {
        pwd: null,
        pwd2: null
      },
      rules: {
        pwd: [{ required: true, validator: validatePwd, trigger: 'blur' }],
        pwd2: [{ required: true, validator: validatePwd2, trigger: 'change' }]
      }
    }
  },
  methods: {
    handleCentor () {
      this.dialogCentor = true
    },
    handleUpdatePwd () {
      this.dialogVisible = true
      this.$nextTick(() => this.$refs['dataForm'].clearValidate())
    },
    updatePwd () {

    }
  }
}
</script>

<style lang="stylus" scoped>
.navbar
  height 50px
  line-height 50px
  border-radius 0px !important
  overflow hidden
  .blog-humburger-container
    line-height 58px
    height 50px
    cursor pointer
    float left
    padding 0 12px
  .blog-right-menu
    float right
    height 100%
    padding 0 8px
    &:focus
      outline none
    .blog-dropdown
      margin-right 15px
      cursor pointer
.blog-centor-container
  width 100%
  height 100%
  .blog-centor-form
    width 50%
    float left
  .blog-centor-img
    float right
    margin 25px 55px 0 0
    cursor pointer
</style>

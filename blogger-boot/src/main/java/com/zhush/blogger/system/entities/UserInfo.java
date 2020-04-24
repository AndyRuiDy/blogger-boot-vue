package com.zhush.blogger.system.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
public class UserInfo extends BaseEntity{

    private String uid;

    private String username; // 用户账号

    private String nick; // 用户昵称

    private String password; // 密码

    private String salt; // 盐值

    private String avatar; // 头像

    private Integer status; // 状态(1：正常  2：冻结 ）

    private Integer delFlag; // 删除状态（0，正常，1已删除）

}

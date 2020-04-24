package com.zhush.blogger.system.entities;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @ClassName: UserDemo
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/9/26 9:22
 * @Version V1.0.0
 **/
@Data
@TableName("tb_blog_user_demo")
public class UserDemo {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;

    private String email;
}

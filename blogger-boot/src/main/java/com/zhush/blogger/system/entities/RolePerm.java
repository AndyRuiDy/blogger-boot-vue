package com.zhush.blogger.system.entities;

import lombok.Data;

/**
 * @ClassName: RolePerm
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/9/25 21:11
 * @Version V1.0.0
 **/
@Data
public class RolePerm {

    private String id;

    private String roleId; // 角色id

    private String permId; // 权限id
}

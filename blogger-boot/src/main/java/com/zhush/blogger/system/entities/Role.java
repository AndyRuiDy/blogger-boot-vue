package com.zhush.blogger.system.entities;

import lombok.Data;

/**
 * @ClassName: Role
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/9/25 21:06
 * @Version V1.0.0
 **/
@Data
public class Role extends BaseEntity{

    private String id;

    private String roleName; // 角色名称

    private String roleCode; // 角色编号

    private String description; // 描述

}

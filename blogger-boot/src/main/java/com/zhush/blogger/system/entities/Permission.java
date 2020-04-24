package com.zhush.blogger.system.entities;

import lombok.Data;

/**
 * @ClassName: Permission
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/9/25 21:12
 * @Version V1.0.0
 **/
@Data
public class Permission extends BaseEntity {

    private String id;

    private String parentId; // 父id

    private String name; // 菜单标题

    private String url; // 路径

    private Integer sortNo; // 菜单排序

    private String component; // 组件

    private String componentName; // 组件名字

    private String redirect; // 一级菜单跳转地址

    private Integer menuType; // 菜单类型(0:一级菜单, 1:子菜单, 2:按钮权限)

    private String permsCode; // 菜单权限编码

    private String permsType; // 权限策略(1:显示, 2:禁用)

    private Boolean alwaysShow; // 聚合子路由(1:是, 0:否)

    private String icon; // 菜单图标

    private Boolean isRoute; // 是否路由菜单(0:不是, 1:是（默认值1）

    private Boolean isLeaf; // 是否叶子节点(1:是, 0:不是)

    private Boolean keepAlive; // 是否缓存该页面(1:是, 0:不是)

    private Boolean hidden; // 是否隐藏路由(0:否, 1:是)

    private Integer delFlag; // 删除状态(0:正常, 1:已删除)

    private String status; // 按钮权限状态(0:无效, 1:有效)

    private String description; // 描述

}

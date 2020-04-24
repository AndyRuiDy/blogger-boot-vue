package com.zhush.blogger.system.entities;

import lombok.Data;

/**
 * @ClassName: UserRole
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/9/25 21:09
 * @Version V1.0.0
 **/
@Data
public class UserRole {

    private String id;

    private String userId; // 用户id

    private String roleId; // 角色id

}

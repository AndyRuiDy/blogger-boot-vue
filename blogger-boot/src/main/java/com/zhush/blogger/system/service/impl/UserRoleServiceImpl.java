package com.zhush.blogger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhush.blogger.system.entities.UserRole;
import com.zhush.blogger.system.mapper.UserRoleMapper;
import com.zhush.blogger.system.service.IUserRoleService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserRoleServiceImpl
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/9/26 14:55
 * @Version V1.0.0
 **/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {
}

package com.zhush.blogger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhush.blogger.system.entities.RolePerm;
import com.zhush.blogger.system.mapper.RolePermMapper;
import com.zhush.blogger.system.service.IRolePermissionService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: RolePermissionServiceImpl
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/9/26 14:58
 * @Version V1.0.0
 **/
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermMapper, RolePerm> implements IRolePermissionService {
}

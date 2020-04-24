package com.zhush.blogger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhush.blogger.system.entities.Role;
import com.zhush.blogger.system.mapper.RoleMapper;
import com.zhush.blogger.system.service.IRolesService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: RoleServiceImpl
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/9/26 14:52
 * @Version V1.0.0
 **/
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRolesService {
}

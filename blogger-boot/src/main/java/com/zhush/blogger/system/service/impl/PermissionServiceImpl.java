package com.zhush.blogger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhush.blogger.system.entities.Permission;
import com.zhush.blogger.system.mapper.PermissionMapper;
import com.zhush.blogger.system.service.IPermissionService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PermissionServiceImpl
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/9/26 14:54
 * @Version V1.0.0
 **/
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {
}

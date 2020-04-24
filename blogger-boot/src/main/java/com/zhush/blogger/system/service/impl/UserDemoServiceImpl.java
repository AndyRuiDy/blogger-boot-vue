package com.zhush.blogger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhush.blogger.system.entities.UserDemo;
import com.zhush.blogger.system.mapper.demo.UserDemoMapper;
import com.zhush.blogger.system.service.IUserDemoService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserDemoServiceImpl
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/9/26 10:16
 * @Version V1.0.0
 **/
@Service
public class UserDemoServiceImpl extends ServiceImpl<UserDemoMapper, UserDemo> implements IUserDemoService {
}

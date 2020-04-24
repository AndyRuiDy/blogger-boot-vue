package com.zhush.blogger.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhush.blogger.system.entities.UserInfo;
import com.zhush.blogger.system.mapper.UserInfoMapper;
import com.zhush.blogger.system.service.IUserInfoService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: UserInfoServiceImpl
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/9/26 14:45
 * @Version V1.0.0
 **/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {
}

package com.zhush.blogger.system.controller;

import com.zhush.blogger.system.entities.UserDemo;
import com.zhush.blogger.system.service.IUserInfoService;
import com.zhush.blogger.system.service.IUserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhush
 * @Description:
 * @date 2019-08-12 21:01
 */
@Controller
public class UserInfoController {

    @Autowired
    private IUserInfoService userInfoService;

    @Autowired
    private IUserDemoService iUserDemoService;
    
    /* *
     * @MethodName: getUserInfoById
     * @Description:
     * @Param: [id]
     * @Return: com.zhush.blogger.system.entities.UserInfo
     * @Author: zhushanhui
     * @Date: 2019/8/13 23:14
    **/
//    @RequestMapping("/getUserInfoById/{id}")
    @GetMapping("/getUserInfoById/{id}")
    @ResponseBody
    public UserDemo getUserInfoById(@PathVariable("id") Integer id){
        UserDemo byId = iUserDemoService.getById(id);
        return byId;
    }


}

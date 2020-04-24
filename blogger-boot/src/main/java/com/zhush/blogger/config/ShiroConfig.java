package com.zhush.blogger.config;

import com.zhush.blogger.shiro.BloggerRealm;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zhushanhui
 * @Description: shiro 配置
 * @date 2019-08-12 21:56
 */
@Configuration
public class ShiroConfig {

    /* *
     * @MethodName: securityManager
     * @Description: 将自定义的realm注入到DefaultWebSecurityManager中
     * @Param: [bloggerRealm]
     * @Return: org.apache.shiro.web.mgt.DefaultWebSecurityManager
     * @Author: zhushanhui
     * @Date: 2019/8/14 20:59
     * */
    @Bean("securityManager")
    public DefaultWebSecurityManager securityManager(BloggerRealm bloggerRealm){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(bloggerRealm);

        return defaultWebSecurityManager;
    }

    /* *
     * @MethodName: shiroFilterFactoryBean
     * @Description: 过滤器类
     * @Param: [securityManager]
     * @Return: org.apache.shiro.spring.web.ShiroFilterFactoryBean
     * @Author: zhushanhui
     * @Date: 2019/8/14 21:13
     * */
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager){
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        factoryBean.setSecurityManager(securityManager);

        // 设置过滤路径
        Map<String, String> filterMap = new LinkedHashMap<String, String>();
        // 以下是允许匿名访问
        filterMap.put("/**", "authc");
        filterMap.put("/druid/**", "anon");

        factoryBean.setFilterChainDefinitionMap(filterMap);
        
        return factoryBean;
    }

    /**
     * 以下代码是添加注解支持
     * @return
     */
    @Bean
    @DependsOn("lifecycleBeanPostProcessor")
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator = new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setProxyTargetClass(true);
        return defaultAdvisorAutoProxyCreator;
    }

    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }

}

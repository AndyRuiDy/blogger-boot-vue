package com.zhush.blogger;

import com.zhush.blogger.system.entities.UserDemo;
import com.zhush.blogger.system.mapper.demo.UserDemoMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BloggerBootApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    private UserDemoMapper userDemoMapper;

    @Test
    public void testInsert(){
        UserDemo userDemo = new UserDemo();
        userDemo.setName("LYY");
        userDemo.setAge(23);
        userDemo.setEmail("lyysh@163.com");
        int test = userDemoMapper.insert(userDemo);
        System.out.println("================"+ test +"==================");
    }

    @Test
    public void testSelect(){
        System.out.println("----------select method test-------------");
        List<UserDemo> list = userDemoMapper.selectList(null);
        Assert.assertEquals(6, list.size());
        list.forEach(System.out::println);
    }

    @Test
    public void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());

        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}

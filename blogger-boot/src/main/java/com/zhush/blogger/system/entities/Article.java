package com.zhush.blogger.system.entities;

import lombok.Data;

import java.util.Date;

/**
 * @ClassName: Article
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/10/19 12:10
 * @Version V1.0.0
 **/
@Data
public class Article extends BaseEntity{

    private String id;

    // 分类id
    private String classifyId;

    // 标题
    private String title;

    // 内容
    private String content;

    // 阅读人数
    private Integer readPeople;

    // 点赞人数
    private Integer likePeople;

    private Date publishTime;

    private Date updateTime;

}


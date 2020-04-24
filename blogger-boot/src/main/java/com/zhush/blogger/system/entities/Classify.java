package com.zhush.blogger.system.entities;

import lombok.Data;

/**
 * @ClassName: Classify
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2020/2/1 10:43
 * @Version V1.0.0
 **/
@Data
public class Classify extends BaseEntity{

    private String id;

    // 分类类名
    private String classifyName;

}

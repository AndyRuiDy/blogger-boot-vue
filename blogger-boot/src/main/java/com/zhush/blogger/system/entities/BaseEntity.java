package com.zhush.blogger.system.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: BaseEntity
 * @Description:
 * @Author zhushanhui andycabbage@163.com
 * @Date 2019/9/25 20:50
 * @Version V1.0.0
 **/
@Data
public class BaseEntity implements Serializable {

    private String createBy; // 创建人

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime; // 创建时间

    private  String updateBy; // 更新人

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateTime; // 更新时间
}

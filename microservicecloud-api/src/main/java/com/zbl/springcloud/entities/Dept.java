package com.zbl.springcloud.entities;

import lombok.Data;

@Data
public class Dept {
    /** 主键 */
    private Integer deptNo;
    /** 部门名称*/
    private String deptName;
    /** 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库*/
    private String dbSource;
}

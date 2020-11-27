package com.txw.boot.crud.entity;

import lombok.Data;
/**
 * Customer 实体类 {@link Customer}
 */
@SuppressWarnings("all")      // 注解警告信息
@Data   // 自动生成set和get方法
public class Customer {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
}
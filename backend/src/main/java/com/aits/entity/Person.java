package com.aits.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author jared
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
    //指明这个属性映射为数据库的主键
    @Id
    //注解默认使用主键声称方式为自增
    @GeneratedValue
    public  Long id;
    @NotEmpty(message = "姓名不能为空")
    String name;
    Integer age;
    String address;
}

package com.huoranger.base.bo;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import java.util.List;
import java.util.Map;

/**
 * @author: huzc
 * @date: 2/15/2023 9:22 PM
 * @description:
 */
@ConfigurationProperties(prefix = "student")
@Component
@Data
@ToString
@Validated
public class Student {

    private String name;
    @Min(16)
    private Integer age;
    private Map<String, Object> maps;
    private List<Object> list;
    private Cat cat;
}

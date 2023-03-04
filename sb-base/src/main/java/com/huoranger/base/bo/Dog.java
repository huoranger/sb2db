package com.huoranger.base.bo;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author: huzc
 * @date: 2/15/2023 9:38 PM
 * @description:
 */
@Data
@PropertySource("classpath:dog.properties")
@Component
@ToString
public class Dog {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
}

package com.huoranger.base;

import com.huoranger.base.bo.Dog;
import com.huoranger.base.bo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author: huzc
 * @date: 2/15/2023 9:30 PM
 * @description: 测试
 */
@SpringBootTest
public class BaseApplicationTests {

    @Resource
    private Student student;

    @Resource
    private Dog dog;

    @Test
    public void testYaml() {
        System.out.println(student);
    }

    @Test
    public void testValueProperties() {
        System.out.println(dog);
    }
}

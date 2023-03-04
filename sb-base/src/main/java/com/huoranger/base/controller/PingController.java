package com.huoranger.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: huzc
 * @date: 2/17/2023 8:25 PM
 * @description:
 */
@RestController
public class PingController {

    @GetMapping("ping")
    public Map<String, Object> ping() {
        return new HashMap<>() {
            {
                put("status", 200);
                put("msg", "pong");
            }
        };
    }

}

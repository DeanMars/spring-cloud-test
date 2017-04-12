package com.chulianfeng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dean on 2017/4/12.
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }


}

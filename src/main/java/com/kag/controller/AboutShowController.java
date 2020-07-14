package com.kag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: KHighness
 * @Date: 2020/6/22 1:04
 * @Description: 关于页面控制器
 */

@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about(){
        return "about";
    }
}

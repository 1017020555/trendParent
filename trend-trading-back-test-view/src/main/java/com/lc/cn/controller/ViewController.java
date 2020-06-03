package com.lc.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * @Author: lichao
 * @Date: 2020/6/3 8:57
 */
@Controller
public class ViewController {

    @GetMapping("/")
    public String view(){
        return "view";
    }

}

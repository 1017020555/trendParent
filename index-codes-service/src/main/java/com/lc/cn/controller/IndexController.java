package com.lc.cn.controller;

import com.lc.cn.config.IpConfiguration;
import com.lc.cn.pojo.Index;
import com.lc.cn.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
/*
 * @Author: lichao
 * @Date: 2020/5/31 17:15
 */

@RestController
public class IndexController {

    @Autowired
    IndexService indexService;

    @Autowired
    IpConfiguration ipConfiguration;

//  http://127.0.0.1:8011/codes

    @GetMapping("/codes")
    @CrossOrigin
    public List<Index> codes() throws Exception {
        System.out.println("current instance's port is "+ ipConfiguration.getPort());
        return indexService.get();
    }

}

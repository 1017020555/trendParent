package com.lc.cn.controller;

import com.lc.cn.config.IpConfiguration;
import com.lc.cn.pojo.IndexData;
import com.lc.cn.service.IndexDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * @Author: lichao
 * @Date: 2020/5/31 17:41
 */

@RestController
public class IndexDataController {
    @Autowired
    IndexDataService indexDataService;
    @Autowired
    IpConfiguration ipConfiguration;

//  http://127.0.0.1:8021/data/000300

    @GetMapping("/data/{code}")
    public List<IndexData> get(@PathVariable("code") String code) throws Exception {
        System.out.println("current instance is :" + ipConfiguration.getPort());
        return indexDataService.get(code);
    }

}

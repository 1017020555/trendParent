package com.lc.cn.controller;

import com.lc.cn.pojo.IndexData;
import com.lc.cn.service.IndexDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
 * @Author: lichao
 * @Date: 2020/5/31 16:10
 */
@Controller
public class IndexDataController {
    @Autowired
    IndexDataService indexDataService;

//  http://127.0.0.1:8001/freshIndexData/000300
//  http://127.0.0.1:8001/getIndexData/000300
//  http://127.0.0.1:8001/removeIndexData/000300

    @GetMapping("/freshIndexData/{code}")
    @ResponseBody
    public String fresh(@PathVariable("code") String code) throws Exception {
        indexDataService.fresh(code);
        return "fresh index data successfully";
    }
    @GetMapping("/getIndexData/{code}")
    @ResponseBody
    public List<IndexData> get(@PathVariable("code") String code) throws Exception {
        return indexDataService.get(code);
    }
    @GetMapping("/removeIndexData/{code}")
    @ResponseBody
    public String remove(@PathVariable("code") String code) throws Exception {
        indexDataService.remove(code);
        return "remove index data successfully";
    }

}

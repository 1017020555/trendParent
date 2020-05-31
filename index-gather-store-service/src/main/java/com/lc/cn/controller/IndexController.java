package com.lc.cn.controller;

import com.lc.cn.pojo.Index;
import com.lc.cn.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
 * @Author: lichao
 * @Date: 2020/5/31 11:37
 */
@Controller
public class IndexController {
    @Autowired
    IndexService indexService;

//    @GetMapping("/getJson")
//    @ResponseBody
//    public List<Index> get() throws Exception {
//        return indexService.fetch_indexes_from_third_part();
//    }

    //  http://127.0.0.1:8001/freshCodes
//  http://127.0.0.1:8001/getCodes
//  http://127.0.0.1:8001/removeCodes

    @GetMapping("/freshCodes")
    @ResponseBody
    public List<Index> fresh() throws Exception {
        return indexService.fresh();
    }
    @GetMapping("/getCodes")
    @ResponseBody
    public List<Index> get() throws Exception {
        return indexService.get();
    }
    @GetMapping("/removeCodes")
    @ResponseBody
    public String remove() throws Exception {
        indexService.remove();
        return "remove codes successfully";
    }
}

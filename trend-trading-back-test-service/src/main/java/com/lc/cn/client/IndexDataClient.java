package com.lc.cn.client;

/*
 * @Author: lichao
 * @Date: 2020/6/1 16:29
 */

import com.lc.cn.pojo.IndexData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(value = "INDEX-DATA-SERVICE",fallback = IndexDataClientFeignHystrix.class)
public interface IndexDataClient {

    @GetMapping("/data/{code}")
    public List<IndexData> getIndexData(@PathVariable("code") String code);

}

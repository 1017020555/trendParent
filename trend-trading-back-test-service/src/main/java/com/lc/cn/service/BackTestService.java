package com.lc.cn.service;
/*
 * @Author: lichao
 * @Date: 2020/6/1 16:31
 */
import com.lc.cn.client.IndexDataClient;
import com.lc.cn.pojo.IndexData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class BackTestService {
    @Resource
    private IndexDataClient indexDataClient;

    public List<IndexData> listIndexData(String code){
        List<IndexData> result = indexDataClient.getIndexData(code);
        Collections.reverse(result);

        for (IndexData indexData : result) {
            System.out.println(indexData.getDate());
        }

        return result;
    }
}

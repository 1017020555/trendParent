package com.lc.cn.client;

/*
 * @Author: lichao
 * @Date: 2020/6/1 16:30
 */

import cn.hutool.core.collection.CollectionUtil;
import com.lc.cn.pojo.IndexData;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class IndexDataClientFeignHystrix implements IndexDataClient {

    @Override
    public List<IndexData> getIndexData(String code) {
        IndexData indexData = new IndexData();
        indexData.setClosePoint(0);
        indexData.setDate("0000-00-00");
        return CollectionUtil.toList(indexData);
    }

}

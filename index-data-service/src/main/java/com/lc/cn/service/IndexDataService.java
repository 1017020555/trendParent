package com.lc.cn.service;

/*
 * @Author: lichao
 * @Date: 2020/5/31 17:39
 */

import cn.hutool.core.collection.CollUtil;
import com.lc.cn.pojo.IndexData;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@CacheConfig(cacheNames="index_datas")
public class IndexDataService {

    @Cacheable(key="'indexData-code-'+ #p0")
    public List<IndexData> get(String code){
        return CollUtil.toList();
    }

}

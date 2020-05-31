package com.lc.cn.job;

/*
 * @Author: lichao
 * @Date: 2020/5/31 16:36
 */

import cn.hutool.core.date.DateUtil;
import com.lc.cn.pojo.Index;
import com.lc.cn.service.IndexDataService;
import com.lc.cn.service.IndexService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import java.util.List;

public class IndexDataSyncJob extends QuartzJobBean {

    @Autowired
    private IndexService indexService;
    @Autowired
    private IndexDataService indexDataService;

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("定时启动：" + DateUtil.now());

        List<Index> indexes = indexService.fresh();

        for (Index index : indexes) {
            indexDataService.fresh(index.getCode());
        }
        System.out.println("定时结束：" + DateUtil.now());

    }
}

package com.feitian.admin.service;

import com.feitian.admin.entity.SalesStatistics;
import com.feitian.admin.service.support.IBaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface ISalesStatisticsService  extends IBaseService<SalesStatistics,Long> {
    /**
     * 根据对象查询数据
     * @param salesStatistics
     * @param pageRequest
     * @return
     */
    Page<SalesStatistics> findAllByExample(SalesStatistics salesStatistics, PageRequest pageRequest);
}

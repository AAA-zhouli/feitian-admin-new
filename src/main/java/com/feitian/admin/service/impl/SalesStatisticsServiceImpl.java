package com.feitian.admin.service.impl;

import com.feitian.admin.dao.ISalesStatisticsDao;
import com.feitian.admin.dao.support.IBaseDao;
import com.feitian.admin.entity.SalesStatistics;
import com.feitian.admin.service.ISalesStatisticsService;
import com.feitian.admin.service.support.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class SalesStatisticsServiceImpl extends BaseServiceImpl<SalesStatistics,Long> implements ISalesStatisticsService {
    @Autowired
    private ISalesStatisticsDao salesStatisticsDao;
    @Override
    public IBaseDao<SalesStatistics, Long> getBaseDao() {
        return salesStatisticsDao;
    }

    @Override
    public Page<SalesStatistics> findAllByExample(SalesStatistics salesStatistics, PageRequest pageRequest){
        Example<SalesStatistics> example = Example.of(salesStatistics);
        return salesStatisticsDao.findAll(example,pageRequest);
    }
}

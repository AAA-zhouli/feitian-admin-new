package com.feitian.admin.service.impl;

import com.feitian.admin.dao.ITradeFlowDao;
import com.feitian.admin.dao.support.IBaseDao;
import com.feitian.admin.entity.TradeFlow;
import com.feitian.admin.service.ITradeFlowService;
import com.feitian.admin.service.support.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class TradeFlowServiceImpl extends BaseServiceImpl<TradeFlow,Long> implements ITradeFlowService {

    @Autowired
    private ITradeFlowDao tradeFlowDao;
    @Override
    public IBaseDao<TradeFlow, Long> getBaseDao() {
        return tradeFlowDao;
    }

    @Override
    public Page<TradeFlow> findAllByExample(TradeFlow tradeFlow, PageRequest pageRequest){
        Example<TradeFlow> example = Example.of(tradeFlow);
//        Range<TradeFlow> tradeFlowRange = new Range<TradeFlow>();
//        Specification<TradeFlow> specification = new ByExampleSpecification
        return tradeFlowDao.findAll(example,pageRequest);
    }

    @Override
    public Page<TradeFlow> findAllByLike(String searchText, PageRequest pageRequest) {





//                tradeFlowDao.findAll;
        return tradeFlowDao.findAll(pageRequest);
    }
}

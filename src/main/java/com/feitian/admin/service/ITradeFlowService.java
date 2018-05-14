package com.feitian.admin.service;

import com.feitian.admin.entity.TradeFlow;
import com.feitian.admin.service.support.IBaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface ITradeFlowService extends IBaseService<TradeFlow,Long> {
    /**
     * 根据关键字获取分页
     * @param searchText
     * @param pageRequest
     * @return
     */
    Page<TradeFlow> findAllByLike(String searchText, PageRequest pageRequest);

    /**
     * 根据实体对象查询
     * @param tradeFlow
     * @param pageRequest
     * @return
     */
    Page<TradeFlow> findAllByExample(TradeFlow tradeFlow, PageRequest pageRequest);
}

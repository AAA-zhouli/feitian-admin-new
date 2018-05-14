package com.feitian.admin.controller.admin.trade;

import com.feitian.admin.controller.BaseController;
import com.feitian.admin.entity.TradeFlow;
import com.feitian.admin.service.ITradeFlowService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/trade/flow")
public class TradeController extends BaseController {
    @Autowired
    private ITradeFlowService tradeFlowService;

    @RequestMapping("/index")
    public String index() {
        return "admin/trade/index";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Page<TradeFlow> list() {
        String styleNumberStr = request.getParameter("styleNumber");
        String orderStatusStr = request.getParameter("orderStatus");
        String shopName = request.getParameter("shopName");
        TradeFlow tradeFlow = new TradeFlow();
        if(StringUtils.isNoneBlank(styleNumberStr)){
            tradeFlow.setStyleNumber(styleNumberStr);
        }
        if(StringUtils.isNoneBlank(orderStatusStr)){
            tradeFlow.setOrderStatus(Integer.parseInt(orderStatusStr));
        }
        if(StringUtils.isNoneBlank(shopName)) {
            tradeFlow.setShopName(shopName);
        }
        Page<TradeFlow> page = tradeFlowService.findAllByExample(tradeFlow,getPageRequest());
        return page;
    }
}

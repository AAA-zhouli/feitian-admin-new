package com.feitian.admin.controller.admin.trade;

import com.feitian.admin.controller.BaseController;
import com.feitian.admin.entity.SalesStatistics;
import com.feitian.admin.service.ISalesStatisticsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin/salesStatistics")
public class SalesStatisticsController extends BaseController {

    @RequestMapping("/index")
    public String index() {
        return "admin/salesStatistics/index";
    }
    @Autowired
    private ISalesStatisticsService salesStatisticsService;
    @RequestMapping("/list")
    @ResponseBody
    public Page<SalesStatistics> list() {
        String styleNumberStr = request.getParameter("styleNumber");
        String shopName = request.getParameter("shopName");
        SalesStatistics salesStatistics = new SalesStatistics();
        if(StringUtils.isNoneBlank(styleNumberStr)){
            salesStatistics.setStyleNumber(styleNumberStr);
        }
        if(StringUtils.isNoneBlank(shopName)) {
            salesStatistics.setShopName(shopName);
        }
        Page<SalesStatistics> page = salesStatisticsService.findAllByExample(salesStatistics,getPageRequest());
        return page;
    }
}

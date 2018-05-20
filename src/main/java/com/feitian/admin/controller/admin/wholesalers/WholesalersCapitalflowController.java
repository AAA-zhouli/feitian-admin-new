package com.feitian.admin.controller.admin.wholesalers;

import com.feitian.admin.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 档口资金流水
 */
@Controller
@RequestMapping("/admin/capitalflow")
public class WholesalersCapitalflowController extends BaseController {

    /**
     * 资金流水管理
     * @return
     */
    @RequestMapping("/capitalflow/index")
    public String capitalFlowIndex() {
        return "admin/wholesalers/capitalflow/index";
    }

    /**
     * 档口商品录入管理
     * @return
     */
    @RequestMapping("/product/index")
    public String productIndex() {
        return "admin/wholesalers/product/index";
    }
}

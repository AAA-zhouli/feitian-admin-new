package com.feitian.admin.controller.admin.wholesalers;


import com.feitian.admin.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 档口充值管理
 */
@Controller
@RequestMapping("/admin/recharge")
public class WholesalersRechargeController extends BaseController {

    /**
     * 充值管理
     * @return
     */
    @RequestMapping("/index")
    public String rechargeIndex() {
        return "admin/recharge/index";
    }



}

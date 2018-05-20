package com.feitian.admin.controller.admin.wholesalers;


import com.feitian.admin.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 档口商品管理
 */
@Controller
@RequestMapping("/admin/product")
public class WholesalersProductController extends BaseController {

    /**
     *
     * @return
     */
    @RequestMapping("/index")
    public String rechargeIndex() {
        return "admin/product/index";
    }



}

package com.feitian.admin;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.request.TradesSoldGetRequest;
import com.taobao.api.response.TradesSoldGetResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;



@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    private static Logger logger = LoggerFactory.getLogger(Application.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static final String appkey = "12253109";
    public static final String secret = "4313e0a9a0999200c0dfcea224415638";
    public static final String url = "http://gw.api.taobao.com/router/rest";


    /**
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        logger.debug("启动成功");
        TaobaoClient client = new DefaultTaobaoClient( url, appkey, secret);

        TradesSoldGetRequest req = new TradesSoldGetRequest();
        req.setFields("tid,type,status,payment,orders,rx_audit_status");
        req.setStartCreated(StringUtils.parseDateTime("2018-03-01 00:00:00"));
        req.setEndCreated(StringUtils.parseDateTime("2018-05-01 23:59:59"));
        req.setStatus("TRADE_FINISHED");
//        req.setBuyerNick("zhangsan");
//        req.setType("game_equipment");
//        req.setExtType("service");
//        req.setRateStatus("RATE_UNBUYER");
//        req.setTag("time_card");
        req.setPageNo(1L);
        req.setPageSize(40L);
        req.setUseHasNext(true);
        TradesSoldGetResponse rsp = client.execute(req, "6101c214f66dc59df23d754ba3cfe13f81fa9a79dead19c1974643988\n");
        System.out.println(rsp.getBody());
        logger.debug("返回结果"+rsp.getBody());
    }


}

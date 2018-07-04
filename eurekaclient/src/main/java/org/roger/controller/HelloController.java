package org.roger.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/7/1.
 */
@RestController
//@RefreshScope
public class HelloController {
    @Value("${server.port}")
    private int port;
    @Value("${spring.datasource.url}")
    private String url;
    @RequestMapping("index")
    public String index(){
        return "Hello World!,端口:"+port+",mysql_url:"+url;
    }
}

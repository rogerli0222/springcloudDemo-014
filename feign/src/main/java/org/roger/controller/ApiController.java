package org.roger.controller;

import org.roger.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/7/1.
 */
@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @RequestMapping("index")
    public String index(){
        return "ferin:"+apiService.index();
    }
}
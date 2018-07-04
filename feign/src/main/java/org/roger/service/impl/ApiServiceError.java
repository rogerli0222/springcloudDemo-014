package org.roger.service.impl;

import org.roger.service.ApiService;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/7/1.
 */
@Component
public class ApiServiceError implements ApiService {

    @Override
    public String index() {
        return "服务发生故障！";
    }
}
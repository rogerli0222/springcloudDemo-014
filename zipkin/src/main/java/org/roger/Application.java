package org.roger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import zipkin.server.EnableZipkinServer;

/**
 * Created by Administrator on 2018/7/4.
 */
@SpringBootApplication
@EnableZipkinStreamServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
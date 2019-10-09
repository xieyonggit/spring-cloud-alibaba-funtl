package com.funtl.spring.cloud.alibaba.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {
    @Value("${server.port}")
    private String port;

    @RequestMapping(value="echo/{string}")
    public String echo(@PathVariable("string") String string){
        return "hello nacos provider"+string;
    }

    @GetMapping(value = "lb")
    public String lb(){
        return "Hello nacos from port: "+port;
    }
}

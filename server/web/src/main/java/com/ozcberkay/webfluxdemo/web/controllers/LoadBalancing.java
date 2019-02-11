package com.ozcberkay.webfluxdemo.web.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoadBalancing {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/port")
    public String greeting() {
        return String.format("Web Client Port : '%s'!", this.port);
    }
}

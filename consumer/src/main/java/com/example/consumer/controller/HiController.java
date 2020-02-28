package com.example.consumer.controller;

import com.example.consumer.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @Autowired
    private ProviderClient providerClient;
    @RequestMapping("hi")
    public String hi() {
        return "say hi to consumer!  " + this.providerClient.get3();
    }
}

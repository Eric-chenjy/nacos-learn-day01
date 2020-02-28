// Refer to document:  https://github.com/nacos-group/nacos-examples/tree/master/nacos-spring-cloud-example/nacos-spring-cloud-config-example
package com.example.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${useLocalCache}")
    private boolean useLocalCache;
    @Value("${isTrue}")
    private boolean isTrue;
    @Value("${myName}")
    private String myName;

    @RequestMapping("/get")
    public boolean get() {
        return useLocalCache;
    }
    @RequestMapping("/get1")
    public boolean get1() {
        return isTrue;
    }
    @RequestMapping("/get2")
    public String  get2() {
        return isTrue+"---";
    }
    @RequestMapping("/get3")
    public String  get3() {
        return myName;
    }
}
package com.yang.demo.springbootdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author yangmingkai
 * @ClassName Config1
 * @Description TODO
 * @date 2018/11/22 2:35 PM
 **/
@Component
@PropertySource("config/demo.properties")
@ConfigurationProperties(prefix = "cionfig.demo")
public class ConfigDemoBean {

    private String name;

    private String mobile;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

package com.yang.demo.springbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author yangmingkai
 * @ClassName Config1
 * @Description TODO
 * @date 2018/11/22 2:35 PM
 **/
@Component
@ConfigurationProperties(prefix = "demo")
public class ConfigBean {

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

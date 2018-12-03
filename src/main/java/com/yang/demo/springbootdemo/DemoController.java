package com.yang.demo.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangmingkai
 * @ClassName DemoController
 * @Description TODO
 * @date 2018/11/22 2:38 PM
 **/
@RestController
public class DemoController {

    @Value("${demo.name}")
    private String name;


    @Value("${demo.mobile}")
    private String mobile;

    @RequestMapping(value = "config1")
    public String config1(){
        return name+"/"+mobile;
    }


    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "config2")
    public String config2(){
        return configBean.getName()+"/"+configBean.getMobile();
    }

    @Autowired
    ConfigDemoBean configDemoBean;

    @RequestMapping(value = "configDemoBean")
    public String configDemo(){
        return configDemoBean.getName()+"/"+configDemoBean.getMobile();
    }
}

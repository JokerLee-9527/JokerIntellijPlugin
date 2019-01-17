package com.joker.plugin.dubbo.consumer.web;

/**
* @Description:    java类作用描述
*
* @Author:         Joker
* @CreateDate:     2019/1/17 14:21
* @UpdateUser:     Joker
* @UpdateDate:     2019/1/17 14:21
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
import com.joker.plugin.dubbo.api.DemoServiceProvider;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoConsumerController {

    @Resource
    private DemoServiceProvider demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoService.sayHello(name);
    }
}
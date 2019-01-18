package com.joker.plugin.dubbo.test;

import com.joker.plugin.dubbo.consumer.service.ConsumerDemoService;
import com.joker.plugin.dubbo.consumer.run.Startup;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
* @Description:    测试消费远程服务
*
* @Author:         Joker
* @CreateDate:     2019/1/17 14:22
* @UpdateUser:     Joker
* @UpdateDate:     2019/1/17 14:22
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Startup.class)
public class ConsumerTest {

    @Autowired
    private ConsumerDemoService consumerDemoService;

    @Test
    public void sayHello(){
        consumerDemoService.sayHello("Joker");
    }

    @Test
    public void sayHello1(){
        consumerDemoService.sayHello1();
    }

    @Test
    public void sayHello2(){
        consumerDemoService.sayHello2();
    }
}

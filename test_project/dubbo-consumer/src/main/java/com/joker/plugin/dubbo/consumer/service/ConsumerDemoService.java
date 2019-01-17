package com.joker.plugin.dubbo.consumer.service;

import com.joker.plugin.dubbo.api.DemoServiceProvider;
import com.joker.plugin.dubbo.api.demain.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @Description:    消费远程方法
*
* @Author:         Joker
* @CreateDate:     2019/1/17 14:20
* @UpdateUser:     Joker
* @UpdateDate:     2019/1/17 14:20
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Service("consumerDemoService")
public class ConsumerDemoService {

    @Autowired
    private DemoServiceProvider demoServiceProvider;

    public void sayHello(String name) {
        UserProfile userProfile = UserProfile.builder()
                .logo("testLogo")
                .nickName("testNickName")
                .birthday("testBirthday")
                .build();
        String hello = demoServiceProvider.sayHello(userProfile,name); // 执行消费远程方法
        System.out.println(hello); // 显示调用结果
    }

}

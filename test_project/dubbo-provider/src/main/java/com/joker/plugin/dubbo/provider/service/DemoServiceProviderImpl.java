package com.joker.plugin.dubbo.provider.service;

import com.alibaba.dubbo.rpc.RpcContext;
import com.joker.plugin.dubbo.api.DemoServiceProvider;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: 提供方实现
 * @Author: Joker
 * @CreateDate: 2019/1/17 11:28
 * @UpdateUser: Joker
 * @UpdateDate: 2019/1/17 11:28
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Service("demoService")
public class DemoServiceProviderImpl implements DemoServiceProvider {

    @Override
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

}

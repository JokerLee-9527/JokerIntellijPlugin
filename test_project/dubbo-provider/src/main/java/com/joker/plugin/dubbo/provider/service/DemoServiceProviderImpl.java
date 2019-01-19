package com.joker.plugin.dubbo.provider.service;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.rpc.RpcContext;
import com.joker.plugin.dubbo.api.DemoServiceProvider;
import com.joker.plugin.dubbo.api.demain.UserProfile;
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
    public String sayHello(UserProfile userProfile, String name) {

        String nickNmae = "nikeName:null";
        if (null != userProfile && StringUtils.isNotEmpty(userProfile.getNickName())) {
            nickNmae = "nickName:" + userProfile.getNickName();
        }

        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + "(" + nickNmae + ")" + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + "(" + nickNmae + ")" + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public String sayHello1(UserProfile userProfile) {
        String nickNmae = "nikeName:null";
        if (null != userProfile && StringUtils.isNotEmpty(userProfile.getNickName())) {
            nickNmae = "nickName:" + userProfile.getNickName();
        }

        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + "(" + nickNmae + ")" + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + "(" + nickNmae + ")" + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public String sayHello2(String name) {

        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public String sayHello3(Integer param) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + param + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + param + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

    @Override
    public String sayHello4(int param) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + param + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + param + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

}

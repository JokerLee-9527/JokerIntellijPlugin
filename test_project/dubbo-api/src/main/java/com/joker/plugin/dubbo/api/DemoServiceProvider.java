package com.joker.plugin.dubbo.api;

import com.joker.plugin.dubbo.api.demain.UserProfile;

/**
* @Description:    定义服务接口
*
* @Author:         Joker
* @CreateDate:     2019/1/17 11:21
* @UpdateUser:     Joker
* @UpdateDate:     2019/1/17 11:21
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public interface DemoServiceProvider {
	
    String sayHello(UserProfile userProfile,String name);
}


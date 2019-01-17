package com.joker.plugin.dubbo.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
* @Description:    加载配置
*
* @Author:         Joker
* @CreateDate:     2019/1/17 14:19
* @UpdateUser:     Joker
* @UpdateDate:     2019/1/17 14:19
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@Configuration
@PropertySource("classpath:dubbo.properties")
@ImportResource({"classpath:dubbo/*.xml"})
public class PropertiesConfig {
}

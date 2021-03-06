package com.joker.plugin.dubbo.provider.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description: 启动提供方服务
 * @Author: Joker
 * @CreateDate: 2019/1/17 11:27
 * @UpdateUser: Joker
 * @UpdateDate: 2019/1/17 11:27
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@SpringBootApplication
@ComponentScan(value = {"com.joker.plugin.dubbo"})
public class Startup {

    public static void main(String[] args) {
        SpringApplication.run(Startup.class, args);
    }
}

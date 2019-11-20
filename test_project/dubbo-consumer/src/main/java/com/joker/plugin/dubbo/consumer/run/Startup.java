package com.joker.plugin.dubbo.consumer.run;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.net.InetAddress;
import java.net.UnknownHostException;


/**
* @Description:    启动服务
*
* @Author:         Joker
* @CreateDate:     2019/1/17 14:19
* @UpdateUser:     Joker
* @UpdateDate:     2019/1/17 14:19
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@SpringBootApplication
@ComponentScan(value = {"com.joker.plugin.dubbo"})
@EnableSwagger2
@Slf4j
public class Startup {

    public static void main(String[] args) throws UnknownHostException {


        // 调试的时候打开这个try catch
//		try {
        Environment env = SpringApplication.run(Startup.class, args).getEnvironment();
        String port = env.getProperty("server.port", "8080");
        log.info(
                "Access URLs:\n----------------------------------------------------------\n\t"
                        + "Swagger-UI: http://127.0.0.1:{}/swagger-ui.html\n\t"
                        + "Local:      http://127.0.0.1:{}\n\t"
                        + "External:   http://{}:{}\n\t"
                        + "----------------------------------------------------------",
                port, port, InetAddress.getLocalHost().getHostAddress(), port,
                port, InetAddress.getLocalHost().getHostAddress(), port
        );
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}

    }
}

package demo.web;

import demo.contract.DemoService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spark.Request;
import spark.Response;
import spark.Route;

import java.io.IOException;

import static spark.Spark.get;

@Configuration
@ComponentScan
@ImportResource({"classpath:dubbo-consumer.xml"})
public class WebApplication implements InitializingBean {

    @Autowired
    private DemoService demoService;

    @Override
    public void afterPropertiesSet() {

        // 默认监听端口 4567

        get("/hello", (request, response) -> demoService.sayHello("张三"));

    }

    public static void main(String[] args) {

        new AnnotationConfigApplicationContext(WebApplication.class);

    }

}

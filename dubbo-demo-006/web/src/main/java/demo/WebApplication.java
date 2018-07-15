package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.get;

public class WebApplication {

    public static void main(String[] args) {

        get("/hello", new Route() {
            public Object handle(Request request, Response response) throws Exception {
                ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-dubbo.xml");
                SayHello sayHello = (SayHello) ctx.getBean("sayHello");
                String s = sayHello.sayHello("张三");
                return s;
            }
        });

        // 默认监听端口 4567 。
    }

}

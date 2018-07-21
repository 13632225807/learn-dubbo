package demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMain {

    public static void main(String[] args) {
        System.out.println("start");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-dubbo.xml");
        SayHello sayHello = (SayHello) ctx.getBean("sayHello");
        String s = sayHello.sayHello("张三");
        System.out.println(s);
        // 结果是输出 "Hello, 张三"
    }

}

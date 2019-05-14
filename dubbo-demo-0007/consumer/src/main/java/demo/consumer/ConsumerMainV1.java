package demo.consumer;

import demo.contract.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"dubbo-consumer.xml"})
public class ConsumerMainV1 {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConsumerMainV1.class);
        DemoService demoService = ctx.getBean(DemoService.class);

        String s = demoService.sayHello("");
        System.out.println(s);

    }

}

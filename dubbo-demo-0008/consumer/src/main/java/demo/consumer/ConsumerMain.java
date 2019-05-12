package demo.consumer;

import demo.contract.DemoService;
import demo.contract.requset.HiRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan
@ImportResource({"dubbo-consumer.xml"})
public class ConsumerMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConsumerMain.class);
        DemoService demoService = ctx.getBean(DemoService.class);
        String s = demoService.sayHello("张三");
        System.out.println(s);
        // 结果是输出 "Hello, 张三"

        HiRequest hiRequest = new HiRequest();
        hiRequest.setMsg(" ");
        String result = demoService.sayHi(hiRequest);
        System.out.println(result);
    }

}

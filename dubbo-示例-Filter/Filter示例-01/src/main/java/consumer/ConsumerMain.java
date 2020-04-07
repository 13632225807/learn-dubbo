package consumer;

import contract.ISayHiRpcService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"dubbo-consumer.xml"})
public class ConsumerMain {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConsumerMain.class);
        ISayHiRpcService demoService = ctx.getBean(ISayHiRpcService.class);

        String s = demoService.sayHi();
        System.out.println("rpc返回结果: " + s);
    }
}

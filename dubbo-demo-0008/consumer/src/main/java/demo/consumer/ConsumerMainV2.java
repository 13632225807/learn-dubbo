package demo.consumer;

import demo.contract.DemoService;
import demo.contract.requset.HiRequest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"dubbo-consumer.xml"})
public class ConsumerMainV2 {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConsumerMainV2.class);
        DemoService demoService = ctx.getBean(DemoService.class);

        HiRequest hiRequest = new HiRequest();
        hiRequest.setMsg(" ");
        String result = demoService.sayHi(hiRequest);
        System.out.println(result);
    }

}

package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = {
        "classpath:dubbo-consumer.xml"
})
public class ConsumerMain implements CommandLineRunner {

    @Autowired
    private SayHelloService sayHello;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SayHelloResponse response = sayHello.sayHello(new SayHelloRequest(null, 1));
        System.out.println("response: " + response);
    }
}

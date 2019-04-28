package demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
@ImportResource(locations={"classpath:dubbo-provider.xml"})
public class ProviderMain {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProviderMain.class, args);
        System.in.read();
    }

}

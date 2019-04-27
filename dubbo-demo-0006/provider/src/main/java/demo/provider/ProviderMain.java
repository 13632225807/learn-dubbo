package demo.provider;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@Configuration
@ComponentScan
@ImportResource({"classpath:dubbo-provider.xml"})
public class ProviderMain {
    public static void main(String[] args) throws IOException {
        new AnnotationConfigApplicationContext(ProviderMain.class);
        System.in.read();
    }
}

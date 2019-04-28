package demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderMain {
    public static void main(String[] args) throws IOException {
        System.out.println("start");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        ctx.start();
        System.in.read();
    }
}

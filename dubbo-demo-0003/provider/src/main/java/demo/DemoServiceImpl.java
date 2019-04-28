package demo;

import org.springframework.stereotype.Service;

@Service // 这个注解不是必须的，dubbo 会自动处理，但是加上更容易读代码
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}

package demo.provider;

import demo.contract.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}

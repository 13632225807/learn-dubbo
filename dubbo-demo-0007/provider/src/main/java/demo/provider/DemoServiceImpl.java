package demo.provider;

import demo.contract.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        log.info("请求数据: {}", name);
        return "Hello, " + name;
    }

}

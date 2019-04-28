package demo.provider;

import demo.contract.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        try {
            Thread.sleep(3000);  // sleep 3 秒，模拟超时
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello, " + name;
    }

}

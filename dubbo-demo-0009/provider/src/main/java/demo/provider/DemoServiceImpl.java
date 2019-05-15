package demo.provider;

import demo.contract.DemoService;
import demo.contract.requset.HiRequest;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    @Override
    public String sayHi(HiRequest request) {
        return "Hi, " + request.getMsg();
    }

}

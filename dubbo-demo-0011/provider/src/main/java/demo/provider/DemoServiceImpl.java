package demo.provider;

import demo.contract.DemoService;
import demo.contract.request.HiRequest;
import demo.contract.response.HiResponse;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    @Override
    public HiResponse sayHi(HiRequest request) {
        HiResponse response = new HiResponse();
        response.setResult("Hi, " + request.getMsg());
        return response;
    }

}

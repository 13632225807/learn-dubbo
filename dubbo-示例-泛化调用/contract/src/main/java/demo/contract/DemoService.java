package demo.contract;

import demo.contract.request.HiRequest;
import demo.contract.response.HiResponse;

public interface DemoService {

    String sayHello(String name);

    HiResponse sayHi(HiRequest request);

}

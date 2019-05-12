package demo.contract;

import demo.contract.requset.HiRequest;


public interface DemoService {

    String sayHello(String name);

    String sayHi(HiRequest request);

}

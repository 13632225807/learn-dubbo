package demo.contract;

import demo.contract.requset.HiRequest;

import javax.validation.constraints.NotBlank;


public interface DemoService {

    String sayHello(@NotBlank(message = "name不能为空") String name);

    String sayHi(HiRequest request);

}

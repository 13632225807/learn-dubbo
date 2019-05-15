package demo.contract;

import demo.contract.request.HiRequest;
import demo.contract.response.HiResponse;

import javax.validation.constraints.NotBlank;


public interface DemoService {

    String sayHello(@NotBlank(message = "name不能为空") String name);

    HiResponse sayHi(HiRequest request);

}

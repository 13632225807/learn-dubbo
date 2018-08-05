package demo;

public class SayHelloServiceImpl implements SayHelloService {

    public SayHelloResponse sayHello(SayHelloRequest request) {

        System.out.println("request: " + request);

        return new SayHelloResponse("Hello " + request.getMsg());
    }

}

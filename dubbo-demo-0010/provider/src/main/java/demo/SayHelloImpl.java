package demo;

public class SayHelloImpl implements SayHello {
    public String sayHello(String name) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello, " + name;
    }
}

package dubbo.hello.child2;

import dubbo.hello.child1.Calculate;

public class CalculateService {

    public static void main(String[] args) {
        int result = Calculate.add(1, 2);
        System.out.println(result);
    }

}

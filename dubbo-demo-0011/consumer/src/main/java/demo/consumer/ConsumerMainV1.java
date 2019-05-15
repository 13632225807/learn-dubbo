package demo.consumer;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.rpc.service.GenericService;

public class ConsumerMainV1 {

    public static void main(String[] args) {
        ApplicationConfig application = new ApplicationConfig();
        application.setName("api-generic-consumer");
        RegistryConfig registry = new RegistryConfig();
        registry.setAddress("zookeeper://127.0.0.1:2181");
        application.setRegistry(registry);

        ReferenceConfig<GenericService> reference = new ReferenceConfig<>();
        // 弱类型接口名
        reference.setInterface("demo.contract.DemoService");
        // 声明为泛化接口
        reference.setGeneric(true);
        reference.setApplication(application);

        // 用com.apache.dubbo.rpc.service.GenericService可以替代所有接口引用
        GenericService genericService = reference.get();

        Object name = genericService.$invoke("sayHi", new String[]{""}, new Object[]{ "世界" });
        System.out.println(name.getClass().getName());
        System.out.println(name);

    }

}

package demo.consumer;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.rpc.service.GenericService;

import java.util.HashMap;
import java.util.Map;

public class ConsumerMainV3 {

    public static void main(String[] args) {
        ApplicationConfig application = new ApplicationConfig();
        application.setName("api-generic-consumer");

        ReferenceConfig<GenericService> reference = new ReferenceConfig<>();
        // 弱类型接口名
        reference.setInterface("demo.contract.DemoService");
        // 服务直连，不经过 zookeeper
        reference.setUrl("dubbo://127.0.0.1:20881");
        // 声明为泛化接口
        reference.setGeneric(true);
        reference.setApplication(application);

        // 用com.apache.dubbo.rpc.service.GenericService可以替代所有接口引用
        GenericService genericService = reference.get();

        Map<String, Object> param = new HashMap<>();
        param.put("msg", "World!");

        Object name = genericService.$invoke(
                "sayHi",
                new String[]{"demo.contract.request.HiRequest"},
                new Object[]{ param }
                );
        System.out.println(name.getClass().getName());
        System.out.println(name);

    }

}
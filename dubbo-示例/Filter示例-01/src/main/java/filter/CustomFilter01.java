package filter;

import org.apache.dubbo.common.Constants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;

@Activate(group = {Constants.PROVIDER, Constants.CONSUMER})
public class CustomFilter01 implements org.apache.dubbo.rpc.Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("开始");
        Result result = invoker.invoke(invocation);
        System.out.println("结束");
        return result;
    }
}

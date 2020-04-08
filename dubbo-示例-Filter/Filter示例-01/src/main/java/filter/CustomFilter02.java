package filter;

import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;

public class CustomFilter02 implements org.apache.dubbo.rpc.Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        System.out.println("CustomFilter02 开始");
        Result result = invoker.invoke(invocation);
        System.out.println("CustomFilter02 结束");
        return result;
    }
}

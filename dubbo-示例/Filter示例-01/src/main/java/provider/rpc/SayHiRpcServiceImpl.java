package provider.rpc;

import contract.ISayHiRpcService;
import org.springframework.stereotype.Service;

@Service
public class SayHiRpcServiceImpl implements ISayHiRpcService {
    @Override
    public String sayHi() {
        return "Hi";
    }
}

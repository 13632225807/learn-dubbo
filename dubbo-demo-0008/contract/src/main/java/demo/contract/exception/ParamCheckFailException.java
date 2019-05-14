package demo.contract.exception;

/**
 * 参数校验失败异常
 */
public class ParamCheckFailException extends RuntimeException {
    public ParamCheckFailException(String msg) {
        super(msg);
    }
}

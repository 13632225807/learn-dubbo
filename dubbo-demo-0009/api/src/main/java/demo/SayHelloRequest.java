package demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class SayHelloRequest implements Serializable {

    @NotNull(message = "msg不能为空")
    private String msg;

//    @NotNull(message = "amount不能为空")
//    @Min(value = 1, message = "amount不能小于1")
    private Integer amount;

}

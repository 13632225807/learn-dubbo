package demo.contract.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class HiRequest implements Serializable {

    @NotBlank(message = "msg不能为空")
    private String msg;

}

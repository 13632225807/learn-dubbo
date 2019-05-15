package demo.contract.response;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class HiResponse  implements Serializable {

    private String result;

}

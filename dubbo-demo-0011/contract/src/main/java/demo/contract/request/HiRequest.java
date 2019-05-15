package demo.contract.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class HiRequest implements Serializable {

    private String msg;

}

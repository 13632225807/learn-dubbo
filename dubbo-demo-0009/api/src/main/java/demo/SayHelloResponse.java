package demo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class SayHelloResponse implements Serializable {

    private String msg;

}

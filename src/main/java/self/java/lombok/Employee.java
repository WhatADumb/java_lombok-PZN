package self.java.lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode()
public class Employee {
    private Integer id;
    private String name;
}

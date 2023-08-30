package self.java.lombok;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = {"price"})
public class Product {
    private final Integer id;
    private String name;
    private Long price;
}

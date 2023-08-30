package self.java.lombok;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    private Integer id;
    private String name;
    private Integer age;

    @Singular
    private List<String> hobbies;
}

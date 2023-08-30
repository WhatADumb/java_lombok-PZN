package self.java.lombok;

import lombok.*;

@Getter
@NoArgsConstructor(staticName = "blankly")
@AllArgsConstructor(staticName = "instanceUserAndPass")
@ToString(exclude = {"password"})
public class Login {
    @Setter(AccessLevel.PROTECTED)
    private String username;

    @Setter(AccessLevel.PROTECTED)
    private String password;
}

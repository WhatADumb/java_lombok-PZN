package self.java.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberTest {
    @Test
    void testWithConstructor() {
        Assertions.assertThrows(NullPointerException.class, () -> {
           Member member = new Member("1", null);
        });
    }

    @Test
    void testWithSetter() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member("1", "po");
            member.setName(null);
        });
    }

    @Test
    void testWithMethod() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Member member = new Member("1", "Oogway");
            System.out.println(member.sayHello(null));
        });
    }
}

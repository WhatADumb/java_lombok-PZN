package self.java.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegisterTest {
    @Test
    void testInitialize() {
        Register register1 = new Register("loki", "secret");
        Register register2 = register1.withUsername("thor");

        Assertions.assertNotEquals(register1.getUsername(), register2.getUsername());
        Assertions.assertEquals(register1.getPassword(), register2.getPassword());
    }
}

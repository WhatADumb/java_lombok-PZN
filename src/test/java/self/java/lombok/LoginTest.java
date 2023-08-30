package self.java.lombok;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LoginTest {
    @Test
    void testConstructor() {
        Login blankLogin = Login.blankly();
        assertNull(blankLogin.getUsername());
        assertNull(blankLogin.getPassword());

        Login login = Login.instanceUserAndPass("A01", "10A");
        assertEquals("A01", login.getUsername());
        assertEquals("10A", login.getPassword());
    }

    @Test
    void testToString() {
        Login login = Login.instanceUserAndPass("A01", "10A");
        System.out.println(login);
    }
}

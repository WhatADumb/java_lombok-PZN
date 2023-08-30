package self.java.lombok;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MerchantTest {
    @Test
    void testConstructor() {
        Merchant merchant = new Merchant("100");
        assertEquals("100", merchant.getId());
        assertNull(merchant.getName());
    }
}

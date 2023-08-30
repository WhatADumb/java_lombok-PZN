package self.java.lombok;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    @Test
    void testEncapsulation() {
        Customer customer = new Customer();
        customer.setId("A1001");
        customer.setName("Fadhil");

        System.out.println("ID CUSTOMER: " + customer.getId());
        System.out.println("CUSTOMER Name: " + customer.getName());
    }

    @Test
    void testConstructor() {
        Customer customer = new Customer();
        assertNull(customer.getId());
        assertNull(customer.getName());

        Customer fixCustomer = new Customer("AAA", "BBB");
        assertEquals("AAA", fixCustomer.getId());
        assertEquals("BBB", fixCustomer.getName());
    }

    @Test
    void testEqualAndHashCode() {
        Customer customer1 = new Customer("AAA", "BBB");
        Customer customer2 = new Customer("AAA", "CCC");

        assertEquals(customer1, customer2);
        assertEquals(customer1.hashCode(), customer2.hashCode());
    }
}

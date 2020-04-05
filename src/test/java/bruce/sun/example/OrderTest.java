package bruce.sun.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void shoulBeAbleToCreateNewOrder() {
        String infoMsg = "from test";
        Order order = new Order(32, infoMsg);
        assertNotNull(order);
        assertEquals(infoMsg,order.getInfoMsg());
    }
}
package bruce.sun.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    @Test
    void shoulBeAbleToCreateNewOrder() {
        Order order = new Order(32);
        assertNotNull(order);
    }
}
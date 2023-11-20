package src.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.Product;
import src.states.DeliveredState;
import src.states.TransitState;
import src.strategies.ExpressStrategy;
import src.strategies.StandardStrategy;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    @DisplayName("set weight test")
    void setWeightTest() {
        double weight = 64;
        Product pac = new Product(weight, null);
        assertEquals(weight, pac.getWeight());
        pac.setWeight(weight);
        assertEquals(weight, pac.getWeight());
    }

    @Test
    @DisplayName("get weight test")
    void getWeightTest() {
        double weight = 53.2;
        Product product = new Product(weight, null);
        assertEquals(weight, product.getWeight());
    }

    @Test
    @DisplayName("strategy set for product")
    void setStrategyTest() {
        StandardStrategy s = new StandardStrategy();
        Product product = new Product(12.2, s);
        assertEquals(s, product.getTransferStrategy());
        ExpressStrategy exp = new ExpressStrategy();
        product.setTransferStrategy(exp);
        assertEquals(exp, product.getTransferStrategy());
    }

    @Test
    @DisplayName("state for product")
    void setStateTest() {
        Product product = new Product(10, null);
        assertTrue(product.getState() instanceof TransitState);
        product.changeState();
        assertTrue(product.getState() instanceof DeliveredState);
    }
}
package src.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.Product;
import src.states.TransitState;
import src.states.DeliveredState;
import src.strategies.ExpressStrategy;
import src.strategies.StandardStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class ProductTest {
    @Test
    @DisplayName("set and get weight test")
    void setWeightTest() {
        double weight = 64;
        Product pac = Product.getInstance();
        pac.setWeight(weight);
        assertEquals(weight, pac.getWeight());
    }

    @Test
    @DisplayName("strategy set for product")
    void setStrategyTest() {
        StandardStrategy s = new StandardStrategy();
        Product product = Product.getInstance();
        product.setTransferStrategy(s);
        assertEquals(s, product.getTransferStrategy());
        ExpressStrategy exp = new ExpressStrategy();
        product.setTransferStrategy(exp);
        assertEquals(exp, product.getTransferStrategy());
    }

    @Test
    @DisplayName("state for product")
    void setStateTest() {
        Product product = Product.getInstance();
        product.transfer_product();
        assertInstanceOf(TransitState.class, product.getState());
        product.deliver_product();
        assertInstanceOf(DeliveredState.class, product.getState());
    }
}
package src.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    @Test
    @DisplayName("set weight test")
    void setWeightTest() {
        double weight = 64;
        Product pac = new Product(weight);
        assertEquals(weight, pac.getWeight());
        pac.setWeight(weight);
        assertEquals(weight, pac.getWeight());
    }

    @Test
    @DisplayName("get weight test")
    void getWeightTest() {
        double weight = 53.2;
        Product product = new Product(weight);
        assertEquals(weight, product.getWeight());
    }
}
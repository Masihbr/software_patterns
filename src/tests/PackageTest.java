package src.tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PackageTest {
    @Test
    public void setWeightTest() {
        double weight = 64;
        Package package = new Package();
        package.setWeight(weight);
        assertEquals(weight, package.getWeight());
    }
}

package src.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.strategies.ExpressStrategy;
import src.strategies.Speed;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExpressStrategyTest {

    @Test
    @DisplayName("get cost")
    void getCostTest() {
        double weight = 45.2;
        ExpressStrategy strategy = new ExpressStrategy();
        assertEquals(weight * 3.5, strategy.getCost(weight));
    }

    @Test
    @DisplayName("speed test")
    void getSpeedTest() {
        ExpressStrategy strategy = new ExpressStrategy();
        assertEquals(Speed.FAST, strategy.getSpeed());
    }
}

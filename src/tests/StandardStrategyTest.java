package src.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import src.strategies.Speed;
import src.strategies.StandardStrategy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StandardStrategyTest {

    @Test
    @DisplayName("get cost")
    void getCostTest() {
        double weight = 45.2;
        StandardStrategy strategy = new StandardStrategy();
        assertEquals(weight * 2.5, strategy.getCost(weight));
    }

    @Test
    @DisplayName("speed test")
    void getSpeedTest() {
        StandardStrategy strategy = new StandardStrategy();
        assertEquals(Speed.NORMAL, strategy.getSpeed());
    }
}

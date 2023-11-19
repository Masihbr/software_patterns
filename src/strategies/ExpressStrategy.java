package src.strategies;

public class ExpressStrategy implements Strategy{
    @Override
    public double getCost(double weight) {
        return weight * 3.5;
    }

    @Override
    public Speed getSpeed() {
        return Speed.FAST;
    }
}

package src.strategies;

public class StandardStrategy implements Strategy{
    @Override
    public double getCost(double weight) {
        return weight * 2.5;
    }

    @Override
    public Speed getSpeed() {
        return Speed.NORMAL;
    }
}

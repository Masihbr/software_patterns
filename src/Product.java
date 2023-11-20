package src;

import src.states.State;
import src.states.TransitState;
import src.strategies.Strategy;

public class Product {
    double weight;
    private static Product instance = null;

    State state;

    Strategy transferStrategy;

    private Product() {
        this.state = new TransitState(this);
        this.transferStrategy = null;
        this.weight = 0;
    }

    public static Product getInstance() {
        if (instance == null) {
            instance = new Product();
        }
        return instance;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Strategy getTransferStrategy() {
        return transferStrategy;
    }

    public void setTransferStrategy(Strategy transferStrategy) {
        this.transferStrategy = transferStrategy;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void changeState() {
        this.state.done();
    }

}

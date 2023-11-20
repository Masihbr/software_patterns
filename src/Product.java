package src;

import src.states.StartState;
import src.states.State;
import src.strategies.Strategy;

public class Product {
    double weight;
    private static Product instance = null;

    State state;

    Strategy transferStrategy;

    private Product() {
        this.state = new StartState(this);
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

    public void changeState(State newState) {
        this.state.done(newState);
    }

    public boolean isFinished() {
        return this.state.isFinished();
    }

    public double getCost() {
        return this.transferStrategy.getCost(this.weight);
    }

}

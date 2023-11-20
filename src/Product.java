package src;

import src.states.State;
import src.states.TransitState;
import src.strategies.Strategy;

public class Product {
    double weight;

    State state;

    Strategy transferStrategy;

    public Product(double weight, Strategy strategy) {
        this.weight = weight;
        this.transferStrategy = strategy;
        this.state = new TransitState(this);
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

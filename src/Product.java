package src;

import src.states.DeliveredState;
import src.states.StartState;
import src.states.State;
import src.states.TransitState;
import src.strategies.Strategy;

public class Product {
    double weight;
    private static Product instance = null;

    State startState;
    State deliveredState;
    State transitState;
    State state;

    Strategy transferStrategy;

    private Product() {
        this.deliveredState = new DeliveredState(this);
        this.startState = new StartState(this);
        this.transitState = new TransitState(this);
        this.state = this.startState;
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

    public void transfer_product() {
        this.state.transfer_product();
    }

    public void deliver_product() {
        this.state.deliver_product();
    }

    public State getStartState() {
        return this.startState;
    }

    public State getDeliveredState() {
        return deliveredState;
    }

    public State getTransitState() {
        return transitState;
    }

    public boolean isDelivered() {
        return this.state == this.deliveredState;
    }

    public double getCost() {
        return this.transferStrategy.getCost(this.weight);
    }
}

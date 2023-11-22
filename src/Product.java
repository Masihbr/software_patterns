package src;

import src.states.StartState;
import src.states.State;
import src.strategies.Strategy;

public class Product {
    double weight;
    boolean delivered;
    private static Product instance = null;

    State state;

    Strategy transferStrategy;

    private Product() {
        this.state = new StartState(this);
        this.transferStrategy = null;
        this.weight = 0;
        this.delivered = false;
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

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public double getCost() {
        return this.transferStrategy.getCost(this.weight);
    }
}

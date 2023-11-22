package src.states;

import src.Product;

public abstract class State {
    protected Product product;

    public State(Product product) {
        this.product = product;
    }

    public abstract void transfer_product();

    public abstract void deliver_product();

    public abstract boolean isFinished();
}

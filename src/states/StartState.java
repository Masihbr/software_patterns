package src.states;

import src.Product;

public class StartState implements State{
    Product product;

    public StartState(Product product) {
        this.product = product;
    }

    @Override
    public void done(State newState) {
        System.out.println("in transit");
        this.product.setState(newState);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}

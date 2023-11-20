package src.states;

import src.Product;

public class TransitState implements State {
    Product product;

    public TransitState(Product product) {
        this.product = product;
    }

    @Override
    public void done(State newState) {
        if (newState instanceof DeliveredState) {
            System.out.println("delivered");
            product.setState(newState);
        } else {
            System.out.println("in transit");
        }
    }

    @Override
    public boolean isFinished() {
        return false;
    }

}

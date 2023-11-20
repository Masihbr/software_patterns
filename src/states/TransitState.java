package src.states;

import src.Product;

public class TransitState implements State {
    Product product;

    public TransitState(Product product) {
        this.product = product;
        System.out.println("in transit product");
    }

    @Override
    public void done() {
        product.setState(new DeliveredState());
    }

}

package src.states;

import src.Product;

public class TransitState extends State {
    public TransitState(Product product) {
        super(product);
    }

    @Override
    public void transfer_product() {
        System.out.println("The product is in transit.");
    }

    @Override
    public void deliver_product() {
        this.product.setState(new DeliveredState(this.product));
        System.out.println("The product was delivered.");
    }
}

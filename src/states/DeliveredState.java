package src.states;

import src.Product;

public class DeliveredState extends State {
    public DeliveredState(Product product) {
        super(product);
    }

    @Override
    public void transfer_product() {
        System.out.println("The product has been delivered.");
    }

    @Override
    public void deliver_product() {
        System.out.println("The product has been delivered.");
    }
}

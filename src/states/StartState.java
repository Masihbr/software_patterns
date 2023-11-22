package src.states;

import src.Product;

public class StartState extends State {

    public StartState(Product product) {
        super(product);
    }

    @Override
    public void transfer_product() {
        this.product.setState(new TransitState(this.product));
        System.out.println("The product is in transit.");
    }

    @Override
    public void deliver_product() {
        System.out.println("The product requires to be transferred first.");
    }
}

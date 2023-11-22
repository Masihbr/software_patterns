package src;

import src.states.DeliveredState;
import src.strategies.ExpressStrategy;
import src.strategies.StandardStrategy;
import src.strategies.Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = Product.getInstance();
        System.out.println("Please enter the weight of the product in kilograms:");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        product.setWeight(weight);
        product.transfer_product();
        do {
            System.out.println("Please select a strategy for transferring the product: (1 for standard, 2 for express):");
            int strategy = scanner.nextInt();
            System.out.println("Please enter the current state of the product: (1 for in transit, 2 for delivered):");
            int state = scanner.nextInt();
            Strategy strategyObj = null;
            if (strategy == 1) {
                strategyObj = new StandardStrategy();
            } else if (strategy == 2) {
                strategyObj = new ExpressStrategy();
            }
            product.setTransferStrategy(strategyObj);
            if (state == 1) {
                product.transfer_product();
            } else if (state == 2) {
                product.deliver_product();
            }
        } while (!product.isDelivered());
        System.out.println("The total cost of transferring the product is:");
        System.out.println(product.getCost());
    }
}

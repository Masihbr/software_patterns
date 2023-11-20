package src;

import src.states.DeliveredState;
import src.states.StartState;
import src.states.State;
import src.states.TransitState;
import src.strategies.ExpressStrategy;
import src.strategies.StandardStrategy;
import src.strategies.Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product = Product.getInstance();
        System.out.println("please give weight:");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        product.setWeight(weight);
        do {
            System.out.println("give strategy for transferring: (1 standard 2 express)");
            int strategy = scanner.nextInt();
            System.out.println("give state of product: 1 in transit 2 delivered");
            int state = scanner.nextInt();
            Strategy strategyObj = null;
            if (strategy == 1){
                strategyObj = new StandardStrategy();
            } else if (strategy == 2) {
                strategyObj = new ExpressStrategy();
            }
            product.setTransferStrategy(strategyObj);
            State stateObj = null;
            if (state == 1) {
                stateObj = new TransitState(product);
                product.changeState(stateObj);
            } else if (state == 2) {
                stateObj = new DeliveredState();
                product.changeState(stateObj);
            }
        } while (!product.isFinished());
        System.out.println("price:");
        System.out.println(product.getCost());
    }
}

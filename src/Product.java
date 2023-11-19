package src;

import src.strategies.Strategy;

public class Product {
    double weight;

    Strategy transferStrategy;

    public Product(double weight, Strategy strategy) {
        this.weight = weight;
        this.transferStrategy = strategy;
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
}

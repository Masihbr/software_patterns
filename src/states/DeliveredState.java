package src.states;

public class DeliveredState implements State {

    public DeliveredState() {
        System.out.println("delivered");
    }

    @Override
    public void done() {System.out.println("we delivered this product already; there is no other state");}
}

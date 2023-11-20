package src.states;

public class DeliveredState implements State {
    @Override
    public void done(State newState) {System.out.println("we delivered this product already; there is no other state");}

    @Override
    public boolean isFinished() {
        return true;
    }
}

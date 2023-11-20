package src.states;

public interface State {
    void done(State newState);

    boolean isFinished();
}

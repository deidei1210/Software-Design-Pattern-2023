package State;

public class StateGood extends PlayerState {
    @Override
    public void goCanteen() {
        super.stateContext.setPlayerState(new StatePerfect());
    }

    @Override
    public void attendGame() {
        super.stateContext.setPlayerState(new StateTired());
    }

    @Override
    public double getState() {
        return 1.0;
    }

    @Override
    public String toString() {
        return "StateGood";
    }
}

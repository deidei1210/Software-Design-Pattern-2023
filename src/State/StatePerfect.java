package State;

public class StatePerfect extends PlayerState {
    @Override
    public void goCanteen() {
    }

    @Override
    public void attendGame() {
        super.stateContext.setPlayerState(new StateGood());
    }

    @Override
    public double getState() {
        return 1.1;
    }

    @Override
    public String toString() {
        return "StatePerfect";
    }
}

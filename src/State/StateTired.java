package State;

public class StateTired extends PlayerState {
    @Override
    public void goCanteen() {
        super.stateContext.setPlayerState(new StateGood());
    }

    @Override
    public void attendGame() {
    }

    @Override
    public double getState() {
        return 0.9;
    }

    @Override
    public String toString() {
        return "StateTired";
    }
}

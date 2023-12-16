package State_new;

public class StateGood extends StudentState {
    @Override
    public void goCanteen() {
        super.stateContext.setStudentState(new StatePerfect());
    }

    @Override
    public void attendGame() {
        super.stateContext.setStudentState(new StateTired());
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

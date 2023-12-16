package State_new;

public class StatePerfect extends StudentState {
    @Override
    public void goCanteen() {
    }

    @Override
    public void attendGame() {
        super.stateContext.setStudentState(new StateGood());
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

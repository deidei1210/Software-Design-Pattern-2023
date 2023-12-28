package State;

public class StateGood extends StudentState {
    @Override
    public void buyBook() {
        super.stateContext.setStudentState(new StatePerfect());
    }

    @Override
    public void attendExam() {
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

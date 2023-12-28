package State;

public class StatePerfect extends StudentState {
    @Override
    public void buyBook() {
    }

    @Override
    public void attendExam() {
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

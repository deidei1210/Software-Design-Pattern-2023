package State;

public class StateTired extends StudentState {
    @Override
    public void buyBook() {
        super.stateContext.setStudentState(new StateGood());
    }

    @Override
    public void attendExam() {
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

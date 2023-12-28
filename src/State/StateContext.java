package State;

public class StateContext {
    private StudentState studentState;

    public void setStudentState(StudentState studentState) {
        this.studentState = studentState;

        this.studentState.setContext(this);
    }

    public double getState() {
        return this.studentState.getState();
    }

}

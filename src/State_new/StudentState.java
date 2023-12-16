package State_new;

public abstract class StudentState {

    protected StateContext stateContext;

    public void setContext(StateContext stateContext) {
        this.stateContext = stateContext;
    }

    public abstract void buyBook();

    public abstract void attendExam();

    public abstract double getState();
}

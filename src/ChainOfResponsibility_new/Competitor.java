package ChainOfResponsibility_new;

import SimpleFactory_new.Student;

public class Competitor extends AbstractOpponent {

    private Student student;
    private ChainOfResponsibility_new.Competitor competitor;

    public Competitor() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
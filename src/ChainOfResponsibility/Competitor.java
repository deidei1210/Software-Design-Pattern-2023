package ChainOfResponsibility;

import SimpleFactory.Student;

public class Competitor extends AbstractOpponent {

    private Student student;
    private ChainOfResponsibility.Competitor competitor;

    public Competitor() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

}
package FactoryMethod_new;

import SimpleFactory_new.Student;

public class StudyChair extends Supplies {
    public StudyChair(Student owner) {
        super(owner);
    }

    @Override
    public String getSupplyName() {
        return "学习椅";
    }
}

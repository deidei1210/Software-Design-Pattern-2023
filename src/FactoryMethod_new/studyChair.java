package FactoryMethod_new;

import SimpleFactory_new.Student;

public class studyChair extends Supplies {
    public studyChair(Student owner) {
        super(owner);
    }

    @Override
    public String getSupplyName() {
        return "学习椅";
    }
}

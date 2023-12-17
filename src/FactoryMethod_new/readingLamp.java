package FactoryMethod_new;

import SimpleFactory_new.Student;

public class readingLamp extends Supplies {
    public readingLamp(Student owner) {
        super(owner);
    }

    @Override
    public String getSupplyName() {
        return "阅读灯";
    }
}

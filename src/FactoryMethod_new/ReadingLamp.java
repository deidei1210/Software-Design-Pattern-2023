package FactoryMethod_new;

import SimpleFactory_new.Student;

public class ReadingLamp extends Supplies {
    public ReadingLamp(Student owner) {
        super(owner);
    }

    @Override
    public String getSupplyName() {
        return "阅读灯";
    }
}

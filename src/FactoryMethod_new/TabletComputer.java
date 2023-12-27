package FactoryMethod_new;

import SimpleFactory_new.Student;

public class TabletComputer extends Supplies {
    public TabletComputer(Student owner) {
        super(owner);
    }

    @Override
    public String getSupplyName() {
        return "性能++的电脑";
    }
}

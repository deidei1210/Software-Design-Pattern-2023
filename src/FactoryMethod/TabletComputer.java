package FactoryMethod;

import SimpleFactory.Student;

public class TabletComputer extends Supplies {
    public TabletComputer(Student owner) {
        super(owner);
    }

    @Override
    public String getSupplyName() {
        return "性能++的电脑";
    }
}

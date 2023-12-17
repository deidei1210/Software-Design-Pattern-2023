package FactoryMethod_new;

import SimpleFactory_new.Student;

public class tabletComputer extends Supplies {
    public tabletComputer(Student owner) {
        super(owner);
    }

    @Override
    public String getSupplyName() {
        return "鼠标";
    }
}

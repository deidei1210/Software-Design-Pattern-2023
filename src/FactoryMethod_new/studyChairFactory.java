package FactoryMethod_new;

import SimpleFactory_new.Student;

public class studyChairFactory implements ISupplyFactory {
    @Override
    public Supplies createSupply(Student owner) {
        return new studyChair(owner);
    }
}

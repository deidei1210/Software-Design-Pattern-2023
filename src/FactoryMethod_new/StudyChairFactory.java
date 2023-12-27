package FactoryMethod_new;

import SimpleFactory_new.Student;

public class StudyChairFactory implements ISupplyFactory {
    @Override
    public Supplies createSupply(Student owner) {
        return new StudyChair(owner);
    }
}

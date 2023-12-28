package FactoryMethod;

import SimpleFactory.Student;

public class StudyChairFactory implements ISupplyFactory {
    @Override
    public Supplies createSupply(Student owner) {
        return new StudyChair(owner);
    }
}

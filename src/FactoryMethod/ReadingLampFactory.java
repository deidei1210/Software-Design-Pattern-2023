package FactoryMethod;

import SimpleFactory.Student;

public class ReadingLampFactory implements ISupplyFactory {
    @Override
    public Supplies createSupply(Student owner) {
        return new ReadingLamp(owner);
    }
}

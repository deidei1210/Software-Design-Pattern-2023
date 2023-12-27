package FactoryMethod_new;

import SimpleFactory_new.Student;

public class ReadingLampFactory implements ISupplyFactory {
    @Override
    public Supplies createSupply(Student owner) {
        return new ReadingLamp(owner);
    }
}

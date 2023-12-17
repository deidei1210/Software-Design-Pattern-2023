package FactoryMethod_new;

import SimpleFactory_new.Student;

public class readingLampFactory implements ISupplyFactory {
    @Override
    public Supplies createSupply(Student owner) {
        return new readingLamp(owner);
    }
}

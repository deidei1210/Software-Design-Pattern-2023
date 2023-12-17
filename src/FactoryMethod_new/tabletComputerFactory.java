package FactoryMethod_new;

import SimpleFactory_new.Student;

public class tabletComputerFactory implements ISupplyFactory {
    @Override
    public Supplies createSupply(Student owner) {
        return new tabletComputer(owner);
    }
}
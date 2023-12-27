package FactoryMethod_new;

import SimpleFactory_new.Student;

public class TabletComputerFactory implements ISupplyFactory {
    @Override
    public Supplies createSupply(Student owner) {
        return new TabletComputer(owner);
    }
}
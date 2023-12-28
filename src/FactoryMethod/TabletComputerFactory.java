package FactoryMethod;

import SimpleFactory.Student;

public class TabletComputerFactory implements ISupplyFactory {
    @Override
    public Supplies createSupply(Student owner) {
        return new TabletComputer(owner);
    }
}
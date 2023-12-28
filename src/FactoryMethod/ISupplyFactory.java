package FactoryMethod;

import SimpleFactory.Student;

public interface ISupplyFactory {
    Supplies createSupply(Student owner);
}


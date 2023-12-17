package FactoryMethod_new;

import SimpleFactory_new.Student;

public interface ISupplyFactory {
    Supplies createSupply(Student owner);
}


package FactoryMethod_new;


import SimpleFactory_new.Student;

public abstract class Supplies {
    private Student owner;

    public Supplies(Student owner) {
        this.owner = owner;
    }

    public abstract String getSupplyName();
}

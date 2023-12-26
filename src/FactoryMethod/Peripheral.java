package FactoryMethod;


import SimpleFactory.Player;

public abstract class Peripheral {
    private Player owner;

    public Peripheral(Player owner) {
        this.owner = owner;
    }

    public abstract String getPeripheralName();
}

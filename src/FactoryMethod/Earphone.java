package FactoryMethod;

public class Earphone extends Peripheral {
    public Earphone(Player owner) {
        super(owner);
    }

    @Override
    public String getPeripheralName() {
        return "耳机";
    }
}

package FactoryMethod;

public class Mouse extends Peripheral {
    public Mouse(Player owner) {
        super(owner);
    }

    @Override
    public String getPeripheralName() {
        return "鼠标";
    }
}

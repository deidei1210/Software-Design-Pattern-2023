package FactoryMethod;

import SimpleFactory.Player;

public class Mouse extends Peripheral {
    public Mouse(Player owner) {
        super(owner);
    }

    @Override
    public String getPeripheralName() {
        return "鼠标";
    }
}

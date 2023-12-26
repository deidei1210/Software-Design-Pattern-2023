package FactoryMethod;

import SimpleFactory.Player;

public class KeyboardFactory implements  IPeripheralFactory{
    @Override
    public Peripheral createPeripheral(Player owner) {
        return new Keyboard(owner);
    }
}

package FactoryMethod;

import SimpleFactory.Player;

public class MousePeripheralFactory implements  IPeripheralFactory{
    @Override
    public Peripheral createPeripheral(Player owner) {
        return new Mouse(owner);
    }
}
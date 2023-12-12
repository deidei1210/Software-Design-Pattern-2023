package FactoryMethod;

import SimpleFactory.Player;

public class EarphoneFactory implements  IPeripheralFactory{
    @Override
    public Peripheral createPeripheral(Player owner) {
        return new Earphone(owner);
    }
}

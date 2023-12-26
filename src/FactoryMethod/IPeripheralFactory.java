package FactoryMethod;

import SimpleFactory.Player;

public interface IPeripheralFactory {
    Peripheral createPeripheral(Player owner);
}


package FactoryMethod;

public class MousePeripheralFactory implements  IPeripheralFactory{
    @Override
    public Peripheral createPeripheral(Player owner) {
        return new Mouse(owner);
    }
}
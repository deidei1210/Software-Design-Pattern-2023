package FactoryMethod;

public class Keyboard extends Peripheral {
    public Keyboard(Player owner) {
        super(owner);
    }

    @Override
    public String getPeripheralName() {
        return "键盘";
    }
}

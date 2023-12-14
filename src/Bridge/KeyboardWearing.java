package Bridge;

import FactoryMethod.Peripheral;

public class KeyboardWearing extends PlayerPeripheral{
    public KeyboardWearing(PeripheralWearer peripheralWearer) {
        super(peripheralWearer);
    }

    @Override
    public void PeripheralWear(Player player, Peripheral peripheral) {
        super.PeripheralWear(player, peripheral);
        player.setHandspeed(player.getHandspeed() + 3);
        player.setEndurance(player.getEndurance() + 2);
    }
}

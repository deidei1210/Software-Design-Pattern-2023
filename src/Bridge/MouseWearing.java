package Bridge;

import FactoryMethod.Peripheral;
import SimpleFactory.Player;

public class MouseWearing extends PlayerPeripheral{
    public MouseWearing(PeripheralWearer peripheralWearer) {
        super(peripheralWearer);
    }

    @Override
    public void PeripheralWear(Player player, Peripheral peripheral) {
        super.PeripheralWear(player, peripheral);
        player.setReaction(player.getReaction() + 3);
        player.setEndurance(player.getEndurance() + 2);
    }
}
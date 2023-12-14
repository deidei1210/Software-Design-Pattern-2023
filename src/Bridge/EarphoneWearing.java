package Bridge;

import FactoryMethod.Peripheral;

public class EarphoneWearing extends PlayerPeripheral{
    public EarphoneWearing(PeripheralWearer peripheralWearer) {
        super(peripheralWearer);
    }

    @Override
    public void PeripheralWear(Player player, Peripheral peripheral) {
        super.PeripheralWear(player, peripheral);
        player.setReaction(player.getReaction() + 3);
        player.setHandspeed(player.getHandspeed() + 2);
    }
}

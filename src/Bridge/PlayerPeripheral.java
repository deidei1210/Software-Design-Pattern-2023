package Bridge;

import SimpleFactory.Player;
import FactoryMethod.Peripheral;

public abstract class PlayerPeripheral {
    private PeripheralWearer peripheralWearer;

    public PlayerPeripheral(PeripheralWearer peripheralWearer) {
        this.peripheralWearer = peripheralWearer;
    }

    //桥接后增加新的功能
    public void PeripheralWear(Player player, Peripheral peripheral){
        peripheralWearer.wear(player, peripheral);
    }
}

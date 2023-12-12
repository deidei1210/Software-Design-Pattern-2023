package Bridge;

import SimpleFactory.Player;
import FactoryMethod.Peripheral;

public interface PeripheralWearer {
    public void wear(Player player, Peripheral peripheral);
}

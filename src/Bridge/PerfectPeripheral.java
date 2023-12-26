package Bridge;

import FactoryMethod.Peripheral;

public class PerfectPeripheral implements PeripheralWearer{
    @Override
    public void wear(Player player, Peripheral peripheral) {
        System.out.println(player.getPlayerName() + "穿戴了" +  peripheral.getPeripheralName() +" 外设，感觉很牛逼");
    }
}

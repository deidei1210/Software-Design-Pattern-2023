package AbstractFactory;

public class GameFactory implements JudgeIngredientFactory {
    //风扇英雄
    @Override
    public Race CreateRace(String race) {
        return null;
    }

    @Override
    public GameType CreateType(String race) {

        switch (race) {
            case "RRLL":
            case "SCLL"://LL 守望前锋：再也不来 SC
                return new ForwardWatch();
            case "RRSC":
            case "SCSC"://SC 风扇英雄 SC
                return new HeroOfFan();
            case "RRMWC":
            case "SCMWC"://MWC 卢氏传说 SC
                return new LoreOfLU();
            case "RRFW":
            case "SCFW"://FW 魔怪争霸2 SC
                return new MgaicWarCraft();
            case "RRHOF":
            case "SCHOF"://HOF 星河争霸 SC
                return new SeaCraft();
            default:
                break;
        }
        return new HeroOfFan();
    }
}
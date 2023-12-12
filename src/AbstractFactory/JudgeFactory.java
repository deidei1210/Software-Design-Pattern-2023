package AbstractFactory;

public class JudgeFactory implements JudgeIngredientFactory {
    @Override
    public Race CreateRace(String race) {
        switch(race){
            case "RRLL":
            case "RRSC":
            case "RRMWC":
            case "RRFW":
            case "RRHOF":
                return new RedRab();
            case "SCLL":
            case "SCSC":
            case "SCMWC":
            case "SCFW":
            case "SCHOF":
                return new SCboy();
            default:
                break;
        }
        return null;
    }

    @Override
    public GameType CreateType(String race) {
        return null;
    }
}

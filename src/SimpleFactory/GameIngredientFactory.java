package SimpleFactory;

public class GameIngredientFactory {
    //设置种族
    public Club setClub(String clubType) {
        if (clubType == null) {
            return null;
        }
        if (clubType.equalsIgnoreCase("EDG")) {
            return new EDG();
        } else if (clubType.equalsIgnoreCase("IG")) {
            return new IG();
        } else if (clubType.equalsIgnoreCase("RNG")) {
            return new RNG();
        }
        return null;
    }

    //设置颜色
    public Nationality setNationality(String nationalityType) {
        if (nationalityType == null) {
            return null;
        }
        if (nationalityType.equalsIgnoreCase("America")) {
            return new America();
        } else if (nationalityType.equalsIgnoreCase("Japan")) {
            return new Japan();
        } else if (nationalityType.equalsIgnoreCase("China")) {
            return new China();
        }
        return null;
    }
}

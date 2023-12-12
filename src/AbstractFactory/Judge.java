package AbstractFactory;

public class Judge {
    private String JudgeName;
    private Race JudgeRace;
    private GameType gameType;

    private JudgeIngredientFactory Gamefactory;// factory interface
    private JudgeIngredientFactory Judgefactory;

    //getter & setter
    public JudgeIngredientFactory getGameFactory() {
        return Gamefactory;
    }

    public JudgeIngredientFactory getJudgeFactory() {
        return Judgefactory;
    }

    public void setFactory(JudgeIngredientFactory Gfactory, JudgeIngredientFactory Jfactory) {//bind product factory
        this.Gamefactory = Gfactory;
        this.Judgefactory = Jfactory;
    }

    public String getJudgeName() {
        return JudgeName;
    }

    public void setJudgeName(String judgeName) {
        JudgeName = judgeName;
    }

    public GameType getGameType() {
        return gameType;
    }

    public Race getJudgeRace() {
        return JudgeRace;
    }

    public void setJudgeRace(Race judgeRace) {
        JudgeRace = judgeRace;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }
}

package AbstractFactory;

public class JudgeStore {
    //单例模式
    private static JudgeStore instance = new JudgeStore();
    private JudgeStore() { }
    private String JudgeName;
    public static JudgeStore getInstance() {
        return instance;
    }

    //选择对应工厂
    public Judge createJudge(String JudgeName) {

        Judge judge = new Judge();
        this.JudgeName = JudgeName;

        judge.setFactory(new GameFactory(), new JudgeFactory());
        

        return judge;
    }

    //设置项目、国籍
    public Judge orderJudge(String JudgeName) {
        Judge judge = createJudge(JudgeName);
        judge.setGameType(judge.getGameFactory().CreateType(this.JudgeName));
        judge.setJudgeRace(judge.getJudgeFactory().CreateRace(this.JudgeName));
        return judge;
    }

}

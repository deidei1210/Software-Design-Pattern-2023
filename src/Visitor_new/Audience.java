package Visitor_new;

//观众类，排名查看者的类
public class Audience implements RankingViewer {
    private String certainItem;

    private String certainName;

    private int certainRanking;

    @Override
    public void view(RankingList rankingList) {
        certainItem = rankingList.getItem();
        certainName = rankingList.getName();
        certainRanking = rankingList.getRanking();
    }

    //查看项目
    public String getCertainItem() {
        System.out.println("所查看考试为：" + certainItem);
        return certainItem;
    }

    //查看运动员
    public String getCertainName() {
        System.out.println("所查看学生姓名为：" + certainName);
        return certainName;
    }

    //查看排名
    public int getCertainRanking() {
        System.out.println("所查看学生排名为：" + certainRanking);
        return certainRanking;
    }
}

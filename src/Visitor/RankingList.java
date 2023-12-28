package Visitor;

//排行榜信息
public class RankingList implements Element {
    private final String item;

    private final String name;

    private final int ranking;

    public RankingList(String item, String name, int ranking) {
        super();
        this.item = item;
        this.name = name;
        this.ranking = ranking;
    }

    public void accept(RankingViewer rankingViewer) {
        rankingViewer.view(this);
    }

    public String getItem() {
        return item;
    }

    public String getName() {
        return name;
    }

    public int getRanking() {
        return ranking;
    }


}

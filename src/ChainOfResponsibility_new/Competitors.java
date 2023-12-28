package ChainOfResponsibility_new;

import ChainOfResponsibility_new.Competitor;
import Iterator.PlayerContainer;

import java.util.ArrayList;
import java.util.Random;

public class Competitors {

    private final ArrayList<Competitor> competitors = new ArrayList<>();

    public Competitors() {
        for (int i = 0; i < 8; ++i) {
            Competitor competitor = new Competitor();
            competitor.setPlayer(PlayerContainer.getInstance().get(i));
            competitors.add(competitor);
        }
    }

    public void fight() {
        int i = 1;
        Competitor presentCompetitor = competitors.get(0);
        presentCompetitor.setNextAbstractOpponent(competitors.get(1));

        while (i < competitors.size()) {
            Competitor nextFighter = (Competitor) presentCompetitor.getNextAbstractOpponent();
            Random rand1 = new Random();
            double random1 = (rand1.nextInt(2000) + 9000);
            Random rand2 = new Random();
            double random2 = (rand2.nextInt(2000) + 9000);
            double value1 = (presentCompetitor.getPlayer().getEndurance() * 10 + presentCompetitor.getPlayer().getHandspeed() * 11
                    + presentCompetitor.getPlayer().getIntelligence() * 14 + presentCompetitor.getPlayer().getReaction() * 12)
                    * presentCompetitor.getPlayer().getPlayerState().getState() * random1;
            double value2 = (nextFighter.getPlayer().getEndurance() * 10 + nextFighter.getPlayer().getHandspeed() * 11
                    + nextFighter.getPlayer().getIntelligence() * 14 + nextFighter.getPlayer().getReaction() * 12)
                    * nextFighter.getPlayer().getPlayerState().getState() * random2;
            if (value1 >= value2) {
                System.out.println("第" + i + "轮：" + presentCompetitor.getPlayer().getPlayerName()
                        + " vs " + nextFighter.getPlayer().getPlayerName() + "  胜者："
                        + presentCompetitor.getPlayer().getPlayerName());
                if (i == 7) break;
                presentCompetitor.setNextAbstractOpponent(competitors.get(++i));
            } else {
                System.out.println("第" + i + "轮：" + presentCompetitor.getPlayer().getPlayerName()
                        + " vs " + nextFighter.getPlayer().getPlayerName() + "  胜者："
                        + nextFighter.getPlayer().getPlayerName());
                if (i == 7) break;
                presentCompetitor = (Competitor) presentCompetitor.getNextAbstractOpponent();
                presentCompetitor.setNextAbstractOpponent(competitors.get(++i));
            }
        }
        System.out.println("冠军是" + presentCompetitor.getPlayer().getPlayerName() + '!');
    }
}

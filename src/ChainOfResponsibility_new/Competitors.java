package ChainOfResponsibility_new;

import ChainOfResponsibility_new.Competitor;
import Iterator_new.StudentContainer;

import java.util.ArrayList;
import java.util.Random;

public class Competitors {

    private ArrayList<Competitor> competitors = new ArrayList<>();
    private Competitor presentCompetitor;

    public Competitors() {
        for (int i = 0; i < 8; ++i) {
            Competitor competitor = new Competitor();
            competitor.setStudent(StudentContainer.getInstance().get(i));
            competitors.add(competitor);
        }
    }

    public void fight() {
        int i = 1;
        presentCompetitor = competitors.get(0);
        presentCompetitor.setNextAbstractOpponent(competitors.get(1));

        while (i < competitors.size()) {
            Competitor nextFighter = (Competitor) presentCompetitor.getNextAbstractOpponent();
            Random rand1 = new Random();
            double random1 = (rand1.nextInt(2000) + 9000);
            Random rand2 = new Random();
            double random2 = (rand2.nextInt(2000) + 9000);
            double value1 = (presentCompetitor.getStudent().getEndurance() * 10 + presentCompetitor.getStudent().getHandspeed() * 11
                    + presentCompetitor.getStudent().getIntelligence() * 14 + presentCompetitor.getStudent().getReaction() * 12)
                    * presentCompetitor.getStudent().getStudentState().getState() * random1;
            double value2 = (nextFighter.getStudent().getEndurance() * 10 + nextFighter.getStudent().getHandspeed() * 11
                    + nextFighter.getStudent().getIntelligence() * 14 + nextFighter.getStudent().getReaction() * 12)
                    * nextFighter.getStudent().getStudentState().getState() * random2;
            if (value1 >= value2) {
                System.out.println("第" + i + "场：" + presentCompetitor.getStudent().getStudentName()
                        + " vs " + nextFighter.getStudent().getStudentName() + "  胜者："
                        + presentCompetitor.getStudent().getStudentName());
                if (i == 7) break;
                presentCompetitor.setNextAbstractOpponent(competitors.get(++i));
            } else {
                System.out.println("第" + i + "场：" + presentCompetitor.getStudent().getStudentName()
                        + " vs " + nextFighter.getStudent().getStudentName() + "  胜者："
                        + nextFighter.getStudent().getStudentName());
                if (i == 7) break;
                presentCompetitor = (Competitor) presentCompetitor.getNextAbstractOpponent();
                presentCompetitor.setNextAbstractOpponent(competitors.get(++i));
            }
        }
        System.out.println("第一名是" + presentCompetitor.getStudent().getStudentName() + '!');
    }
}

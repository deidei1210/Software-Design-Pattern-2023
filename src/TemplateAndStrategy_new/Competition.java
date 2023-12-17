package TemplateAndStrategy_new;

import Builder_new.Exam;
import ChainOfResponsibility_new.Competitors;
import Servant_new.Preparation;

public class Competition extends Exam implements Preparation {

    private Competitors competitors;

    public Competition(String Name) {
        super(Name);
        competitors = new Competitors();
    }

    @Override
    public void examStart() {
        competitors.fight();
    }

    @Override
    public void examEnd() {
        setVisited(true);
    }

    @Override
    public void getValue(int no) {

    }

    @Override
    public void examPreparation() {

    }
}
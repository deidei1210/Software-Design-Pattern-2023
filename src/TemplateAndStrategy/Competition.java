package TemplateAndStrategy;

import Builder.Exam;
import ChainOfResponsibility.Competitors;
import Servant.Preparation;

public class Competition extends Exam implements Preparation {

    private final Competitors competitors;

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
        setTaken(true);
    }

    @Override
    public void getValue(int no) {

    }

    @Override
    public void examPreparation() {

    }
}
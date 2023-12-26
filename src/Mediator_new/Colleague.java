package Mediator_new;

public abstract class Colleague {
    //抽象同事类，也就是玩家和普通玩家的抽象类

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}

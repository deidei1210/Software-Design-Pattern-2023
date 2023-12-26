package Mediator_new;

public class ConcretePlayer extends Colleague {
    //具体同事类，玩家

    public ConcretePlayer(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println(message);
    }

}


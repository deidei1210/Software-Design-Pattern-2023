package Mediator;

public class ConcreteOthers extends Colleague {
    //具体同事类，普通玩家

    public ConcreteOthers(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public void notify(String message) {
        System.out.println("普通玩家通过中介得到消息：" + message);
    }

}
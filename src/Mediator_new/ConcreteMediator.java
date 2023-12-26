package Mediator_new;

public class ConcreteMediator extends Mediator {

    private ConcreteOthers Others;//具体同事1，其他普通玩家
    private ConcretePlayer Player;//具体同事2，参赛玩家

    public void setOthers(ConcreteOthers Others) {
        this.Others = Others;
    }

    public void setAthlete(ConcretePlayer player) {
        this.Player = player;
    }

    @Override
    //普通玩家和参赛玩家发送信息功能
    public void send(String message, Colleague colleague) {
        if (colleague == Others) {
            Player.notify(message);
        } else {
            Others.notify(message);
        }
    }
}

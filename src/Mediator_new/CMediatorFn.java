package Mediator_new;


public class CMediatorFn {
    //单例模式
    private static CMediatorFn instance = new CMediatorFn();

    private CMediatorFn() {
    }

    public static CMediatorFn getInstance() {
        return instance;
    }

    public void MediateFn() {


        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteOthers Others = new ConcreteOthers(mediator);
        ConcretePlayer Player = new ConcretePlayer(mediator);

        mediator.setOthers(Others);
        mediator.setAthlete(Player);

        Others.send("在考研云偶遇其他考生，通知了你尽快参加考试。");
    }

}



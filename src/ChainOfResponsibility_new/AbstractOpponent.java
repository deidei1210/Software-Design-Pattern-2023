package ChainOfResponsibility_new;

public abstract class AbstractOpponent {
    //抽象对手类
    private ChainOfResponsibility_new.AbstractOpponent nextAbstractOpponent;

    //获取下一个对手
    public ChainOfResponsibility_new.AbstractOpponent getNextAbstractOpponent() {
        return nextAbstractOpponent;
    }

    //设置下一个要对战的对手
    public void setNextAbstractOpponent(ChainOfResponsibility_new.AbstractOpponent abstractOpponent) {
        this.nextAbstractOpponent = abstractOpponent;
    }

}
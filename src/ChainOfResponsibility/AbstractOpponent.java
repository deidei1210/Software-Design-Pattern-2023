package ChainOfResponsibility;

public abstract class AbstractOpponent {
    //抽象对手类
    private ChainOfResponsibility.AbstractOpponent nextAbstractOpponent;

    //获取下一个对手
    public ChainOfResponsibility.AbstractOpponent getNextAbstractOpponent() {
        return nextAbstractOpponent;
    }

    //设置下一个要对战的对手
    public void setNextAbstractOpponent(ChainOfResponsibility.AbstractOpponent abstractOpponent) {
        this.nextAbstractOpponent = abstractOpponent;
    }

}
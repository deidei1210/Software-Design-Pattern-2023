package Decorator;

public class Pancake extends Food {
    //填腹一饼类（被装饰者）
    @Override
    public String getDescription() {
        return "填腹一饼" + condiment;
    }
}

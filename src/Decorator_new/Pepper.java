package Decorator_new;

import Decorator.CondimentDecorator;
import Decorator.Food;

public class Pepper extends CondimentDecorator {
    //胡椒粉类（装饰者）
    public Pepper(Food food) {
        super(food);
        getMyFood().condiment = getMyFood().condiment + "+胡椒粉";
    }

    @Override
    public String getDescription() {
        return "胡椒粉";
    }
}

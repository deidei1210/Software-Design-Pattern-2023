package Decorator_new;

import Decorator.CondimentDecorator;
import Decorator.Food;

public class Oil extends CondimentDecorator {
    //香油类（装饰者）
    public Oil(Food food) {
        super(food);
        getMyFood().condiment = getMyFood().condiment + "+香油";
    }

    @Override
    public String getDescription() {
        return "香油";
    }

}

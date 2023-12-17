package Decorator_new;

import Decorator.CondimentDecorator;
import Decorator.Food;

public class Chili extends CondimentDecorator {
    //辣椒类（装饰者）
    public Chili(Food food) {
        super(food);
        getMyFood().condiment = getMyFood().condiment + "+辣椒";
    }

    @Override
    public String getDescription() {
        return "辣椒";
    }

}

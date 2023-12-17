package Decorator_new;

import Decorator.Food;

public class CondimentDecorator extends Decorator.Food {
    //装饰者类

    private Decorator.Food myFood;

    public CondimentDecorator(Decorator.Food myFood) {
        this.myFood = myFood;
    }

    public Food getMyFood() {
        return myFood;
    }

    public String getDescription() {
        return "null";
    }

}

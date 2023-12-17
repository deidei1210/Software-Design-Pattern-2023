package Command_new;

import Decorator.CondimentDecorator;
import Decorator.Food;
import Decorator.Oil;

public class AddOilCommand implements Command {
    //添加配料白砂糖
    private Food myFood;
    private CondimentDecorator addOil;

    public AddOilCommand(Food myFood) {
        this.myFood = myFood;
    }

    public void execute() {
        addOil = new Oil(myFood);
        System.out.println("点单:" + addOil.getDescription());
    }

    public Food getMyFood() {
        return myFood;
    }
}

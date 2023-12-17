package Command_new;

import Decorator.CondimentDecorator;
import Decorator.Food;
import Decorator.Pepper;

public class AddPepperCommand implements Command {
    //添加配料胡椒粉
    private Food myFood;
    private CondimentDecorator addPepper;

    public AddPepperCommand(Food myFood) {
        this.myFood = myFood;
    }

    public void execute() {
        addPepper = new Pepper(myFood);
        System.out.println("点单:" + addPepper.getDescription());
    }

    public Food getMyFood() {
        return myFood;
    }
}

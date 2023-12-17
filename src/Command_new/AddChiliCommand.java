package Command_new;

import Decorator.CondimentDecorator;
import Decorator.Food;
import Decorator.Chili;

public class AddChiliCommand implements Command {
    //添加配料牛奶
    private Food myFood;

    private CondimentDecorator addChili;

    public AddChiliCommand(Food myFood) {
        this.myFood = myFood;
    }

    public void execute() {
        addChili = new Chili(myFood);
        System.out.println("点单:" + addChili.getDescription());
    }

    public Food getMyFood() {
        return myFood;
    }
}

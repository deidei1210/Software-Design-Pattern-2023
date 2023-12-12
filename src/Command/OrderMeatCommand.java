package Command;

import Decorator.Meat;
import Decorator.Food;

public class OrderMeatCommand implements Command {
    //点单肉蛋葱鸡的命令
    private Meat myMeat = new Meat();

    @Override
    public void execute() {
        System.out.println("点单:" + myMeat.getDescription());
    }

    @Override
    public Food getMyFood() {
        return myMeat;
    }
}

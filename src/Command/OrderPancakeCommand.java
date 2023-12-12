package Command;

import Decorator.Pancake;
import Decorator.Food;

public class OrderPancakeCommand implements Command {
    //点单填腹一饼的命令
    private Pancake myPancake = new Pancake();

    @Override
    public void execute() {
        System.out.println("点单:" + myPancake.getDescription());
    }

    @Override
    public Food getMyFood() {
        return myPancake;
    }
}

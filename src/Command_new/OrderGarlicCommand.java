package Command_new;

import Decorator.Food;
import Decorator.Garlic;

public class OrderGarlicCommand implements Command {
    //点单益肝青苔命令
    private Garlic myGarlic = new Garlic();

    @Override
    public void execute() {
        System.out.println("点单:" + myGarlic.getDescription());
    }

    @Override
    public Food getMyFood() {
        return myGarlic;
    }

}

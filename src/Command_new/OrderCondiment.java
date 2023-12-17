package Command_new;

import Memento.CareTaker;
import Decorator.Food;

import java.util.Scanner;

public class OrderCondiment {
    //执行添加教辅资料的控制台交互类
    private CareTaker myCare;
    private Food myFood;

    public OrderCondiment(CareTaker myCare, Food myFood) {
        this.myCare = myCare;
        this.myFood = myFood;
    }

    public boolean start() throws InterruptedException {
        System.out.println("\n请选择您的配料:");
        System.out.println("[0]润 [1]胡椒粉 [2]辣椒粉 [3]香油 [4]撤销 [5]重做 [6]就这样:");
        int j;
        Scanner scan_input1 = new Scanner(System.in);
        j = scan_input1.nextInt();
        while (j != 0) {
            if (j == 1) {
                //添加胡椒粉
                myCare.clear();
                Command addPepper = new AddPepperCommand(myFood);
                addPepper.execute();
                myCare.append(addPepper, myFood.createMemento());
                System.out.println("您目前的点单为:" + myFood.getDescription());
            } else if (j == 2) {
                //添加辣椒粉
                myCare.clear();
                Command addChili = new AddChiliCommand(myFood);
                addChili.execute();
                myCare.append(addChili, myFood.createMemento());
                System.out.println("您目前的点单为: " + myFood.getDescription());
            } else if (j == 3) {
                //添加香油
                myCare.clear();
                Command addOil = new AddOilCommand(myFood);
                addOil.execute();
                myCare.append(addOil, myFood.createMemento());
                System.out.println("您目前的点单为:" + myFood.getDescription());
            } else if (j == 4) {
                //undo
                myCare.undo();
                System.out.println("您目前的点单为: " + myFood.getDescription());
            } else if (j == 5) {
                //redo
                myCare.redo();
                System.out.println("您目前的点单为: " + myFood.getDescription());
            } else if (j == 6) {
                //确定下单
                System.out.println("点单成功！");
                System.out.println("您目前的点单为: " + myFood.getDescription());
                return true;
            }
            System.out.println("\n您可以继续选择配料:");
            System.out.println("[0]润 [1]胡椒粉 [2]辣椒粉 [3]香油 [4]撤销 [5]重做 [6]选好了:");
            j = scan_input1.nextInt();
        }
        return false;
    }
}

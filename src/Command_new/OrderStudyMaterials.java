package Command_new;

import Memento_new.CareTaker;
import Decorator_new.Book;

import java.util.Scanner;

public class OrderStudyMaterials {
    //执行添加教辅资料的控制台交互类
    private final CareTaker myCare;
    private final Book myBook;

    public OrderStudyMaterials(CareTaker myCare, Book myBook) {
        this.myCare = myCare;
        this.myBook = myBook;
    }

    public boolean start() throws InterruptedException {
        System.out.println("\n请选择您的配料:");
        System.out.println("[0]润 [1]错题本 [2]水笔 [3]模拟答题卡 [4]撤销 [5]重做 [6]就这样:");
        int j;
        Scanner scan_input1 = new Scanner(System.in);
        j = scan_input1.nextInt();
        while (j != 0) {
            if (j == 1) {
                //添加胡椒粉
                myCare.clear();
                Command addPepper = new AddNotebookCommand(myBook);
                addPepper.execute();
                myCare.append(addPepper, myBook.createMemento());
                System.out.println("您目前的点单为:" + myBook.getDescription());
            } else if (j == 2) {
                //添加辣椒粉
                myCare.clear();
                Command addChili = new AddPenCommand(myBook);
                addChili.execute();
                myCare.append(addChili, myBook.createMemento());
                System.out.println("您目前的点单为: " + myBook.getDescription());
            } else if (j == 3) {
                //添加香油
                myCare.clear();
                Command addOil = new AddCardCommand(myBook);
                addOil.execute();
                myCare.append(addOil, myBook.createMemento());
                System.out.println("您目前的点单为:" + myBook.getDescription());
            } else if (j == 4) {
                //undo
                myCare.undo();
                System.out.println("您目前的点单为: " + myBook.getDescription());
            } else if (j == 5) {
                //redo
                myCare.redo();
                System.out.println("您目前的点单为: " + myBook.getDescription());
            } else if (j == 6) {
                //确定下单
                System.out.println("点单成功！");
                System.out.println("您目前的点单为: " + myBook.getDescription());
                return true;
            }
            System.out.println("\n您可以继续选择配料:");
            System.out.println("[0]润 [1]错题本 [2]水笔 [3]模拟答题卡 [4]撤销 [5]重做 [6]选好了:");
            j = scan_input1.nextInt();
        }
        return false;
    }
}

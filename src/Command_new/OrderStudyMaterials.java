package Command_new;

import Memento_new.CareTaker;
import Decorator_new.Book;

import java.util.Scanner;

public class OrderStudyMaterials {
    //执行添加教辅资料的控制台交互类
    private final CareTaker myCare;
    private final Book myBook;

    private int studyMaterialMoney=0;//购买辅助资料用的钱


    //构造函数
    public OrderStudyMaterials(CareTaker myCare, Book myBook) {
        this.myCare = myCare;
        this.myBook = myBook;
    }

    public boolean start() throws InterruptedException {
        System.out.println("\n请选择您的辅助学习工具:");
        System.out.println("[0]离开 [1]错题本 [2]水笔 [3]模拟答题卡 [4]撤销 [5]取消撤销 [6]选完啦！:");
        int j;
        Scanner scan_input1 = new Scanner(System.in);
        j = scan_input1.nextInt();
        while (j != 0) {
            if (j == 1) {
                //添加错题本
                myCare.clear();
                Command addNotebook = new AddNotebookCommand(myBook);
                addNotebook.execute();
                myCare.append(addNotebook, myBook.createMemento());
                System.out.println("您目前的点单为:" + myBook.getDescription());
                studyMaterialMoney+= addNotebook.getPrice();
                System.out.println("您目前的总价为: " + studyMaterialMoney);
            } else if (j == 2) {
                //添加水笔
                myCare.clear();
                Command addPen = new AddPenCommand(myBook);
                addPen.execute();
                myCare.append(addPen, myBook.createMemento());
                System.out.println("您目前的点单为: " + myBook.getDescription());
                studyMaterialMoney+= addPen.getPrice();
                System.out.println("您目前的总价为: " + studyMaterialMoney);
            } else if (j == 3) {
                //添加答题卡
                myCare.clear();
                Command addCard = new AddCardCommand(myBook);
                addCard.execute();
                myCare.append(addCard, myBook.createMemento());
                System.out.println("您目前的点单为:" + myBook.getDescription());
                studyMaterialMoney+= addCard.getPrice();
                System.out.println("您目前的总价为: " + studyMaterialMoney);
            } else if (j == 4) {
                //undo撤销
                Command lastCommand=myCare.undo();
                System.out.println("您目前的点单为: " + myBook.getDescription());
                studyMaterialMoney-= lastCommand.getPrice();
                System.out.println("您目前的总价为: " + studyMaterialMoney);
            } else if (j == 5) {
                //redo
                Command lastCommand=myCare.redo();
                System.out.println("您目前的点单为: " + myBook.getDescription());
                if(lastCommand!=null) {
                    studyMaterialMoney+= lastCommand.getPrice();
                }
                System.out.println("您目前的总价为: " + studyMaterialMoney);
            } else if (j == 6) {
                //确定下单
                System.out.println("点单成功！");
                System.out.println("您目前的点单为: " + myBook.getDescription());
                System.out.println("您目前的辅助学习工具总价为: " + studyMaterialMoney);
                return true;
            }
            System.out.println("\n您可以继续选择辅助学习工具:");
            System.out.println("[0]离开 [1]错题本 [2]水笔 [3]模拟答题卡 [4]撤销 [5]取消撤销 [6]选完啦！:");
            j = scan_input1.nextInt();
        }
        return false;
    }

    public int getStudyMaterialMoney(){
        return studyMaterialMoney;
    }
}

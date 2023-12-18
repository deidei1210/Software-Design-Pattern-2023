package Command_new;

import Adapter.AliAdapter;
import Adapter.WechatPay;
import Memento_new.CareTaker;
import Decorator_new.Book;
import Interpreter.ExchangePrice;
import Interpreter.OriginalPrice;
import Interpreter.Price;

import java.util.Scanner;

public class CCommandFn {
    //单例模式
    //执行饮品台控制台交互的类
    private static final CCommandFn instance = new CCommandFn();

    private CCommandFn() {
    }

    public static CCommandFn getInstance() {
        return instance;
    }

    public boolean CommandFn() throws InterruptedException {

        System.out.println("\n欢迎来到嘉年华大食堂(芜湖赞助)，您今天想吃什么？");
        System.out.println("[0]跑路 [1]2025考研数学武忠祥 [2]考研政治肖秀荣 [3]考研英语红宝书:");
        int i;
        Scanner scan_input = new Scanner(System.in);
        i = scan_input.nextInt();
        boolean isOrder = false;  //判断是否点单成功
        while (true) {
            if (i == 0) break;
            switch (i) {
                case 1: {
                    //2025考研数学武忠祥
                    CareTaker orderList = new CareTaker();
                    Command orderMathBook = new OrderMathBookCommand();
                    orderMathBook.execute();
                    Book myMathBook = orderMathBook.getMyBook();
                    orderList.append(orderMathBook, myMathBook.createMemento());
                    OrderStudyMaterials MathBookStudyMaterials = new OrderStudyMaterials(orderList, myMathBook);
                    isOrder = MathBookStudyMaterials.start();
                    break;
                }
                case 2: {
                    //考研政治肖秀荣
                    CareTaker orderList = new CareTaker();
                    Command orderPoliticBook = new OrderPoliticBookCommand();
                    orderPoliticBook.execute();
                    Book myPoliticBook = orderPoliticBook.getMyBook();
                    orderList.append(orderPoliticBook, myPoliticBook.createMemento());
                    OrderStudyMaterials politicBookStudyMaterials = new OrderStudyMaterials(orderList, myPoliticBook);
                    isOrder = politicBookStudyMaterials.start();
                    break;
                }
                case 3: {
                    //考研英语红宝书
                    CareTaker orderList = new CareTaker();
                    Command orderEnglishBook = new OrderEnglishBookCommand();
                    orderEnglishBook.execute();
                    Book myEnglishBook = orderEnglishBook.getMyBook();
                    orderList.append(orderEnglishBook, myEnglishBook.createMemento());
                    OrderStudyMaterials englishBookStudyMaterials = new OrderStudyMaterials(orderList, myEnglishBook);
                    isOrder = englishBookStudyMaterials.start();
                    break;
                }
                default:
                    break;
            }
            i = 0;
            if (!isOrder) {
                System.out.println("\n欢迎来到嘉年华大食堂(芜湖赞助)，您今天想吃什么？");
                System.out.println("[0]跑路 [1]2025考研数学武忠祥 [2]考研政治肖秀荣 [3]考研英语红宝书:");
                i = scan_input.nextInt();
            }
        }
        //如果点单成功，则进行支付
        if (isOrder) {
            Price price = new Price();
            price.SetOriPrice(10f);
            System.out.println("您的点单原价为10");
            price.SetExchange(10f);
            System.out.println("目前汇率 —— 1:10");
            OriginalPrice oriPriceInterpreter = new OriginalPrice();
            oriPriceInterpreter.Method(price);
            float result;
            ExchangePrice discountPriceInterpreter = new ExchangePrice();
            result = discountPriceInterpreter.Method(price);
            System.out.println("现价为：" + result);
            Scanner scan = new Scanner(System.in);
            int type;
            System.out.println("请选择你要使用的支付方式：\n1、Ali支付  2、WeChat支付");
            type = scan.nextInt();
            switch (type) {
                case 1: {
                    //使用支付宝
                    new AliAdapter().pay();
                    break;
                }
                case 2: {
                    //使用微信
                    new WechatPay().pay();
                    break;
                }
            }
            return true;
        }
        return false;
    }
}


package Command;

import Adapter.AliAdapter;
import Adapter.WechatPay;
import Memento.CareTaker;
import Decorator.Food;
import Interpreter.ExchangePrice;
import Interpreter.OriginalPrice;
import Interpreter.Price;

import java.util.Scanner;

public class CCommandFn {
    //单例模式
    //执行饮品台控制台交互的类
    private static CCommandFn instance = new CCommandFn();

    private CCommandFn() {
    }

    public static CCommandFn getInstance() {
        return instance;
    }

    public boolean CommandFn() throws InterruptedException {

        System.out.println("\n欢迎来到嘉年华大食堂(芜湖赞助)，您今天想吃什么？");
        System.out.println("[0]跑路 [1]填腹一饼 [2]肉蛋葱鸡 [3]益肝青苔:");
        int i;
        Scanner scan_input = new Scanner(System.in);
        i = scan_input.nextInt();
        boolean isOrder = false;  //判断是否点单成功
        while (true) {
            if (i == 0) break;
            switch (i) {
                case 1: {
                    //填腹一饼
                    CareTaker orderList = new CareTaker();
                    Command orderPancake = new OrderPancakeCommand();
                    orderPancake.execute();
                    Food myPancake = orderPancake.getMyFood();
                    orderList.append(orderPancake, myPancake.createMemento());
                    OrderCondiment pancakeCondiment = new OrderCondiment(orderList, myPancake);
                    isOrder = pancakeCondiment.start();
                    break;
                }
                case 2: {
                    //肉蛋葱鸡
                    CareTaker orderList = new CareTaker();
                    Command orderMeat = new OrderMeatCommand();
                    orderMeat.execute();
                    Food myMeat = orderMeat.getMyFood();
                    orderList.append(orderMeat, myMeat.createMemento());
                    OrderCondiment meatCondiment = new OrderCondiment(orderList, myMeat);
                    isOrder = meatCondiment.start();
                    break;
                }
                case 3: {
                    //益肝青苔
                    CareTaker orderList = new CareTaker();
                    Command orderGarlic = new OrderGarlicCommand();
                    orderGarlic.execute();
                    Food myGarlic = orderGarlic.getMyFood();
                    orderList.append(orderGarlic, myGarlic.createMemento());
                    OrderCondiment garlicCondiment = new OrderCondiment(orderList, myGarlic);
                    isOrder = garlicCondiment.start();
                    break;
                }
                default:
                    break;
            }
            i = 0;
            if (!isOrder) {
                System.out.println("\n欢迎来到嘉年华大食堂(芜湖赞助)，您今天想吃什么？");
                System.out.println("[0]跑路 [1]填腹一饼 [2]肉蛋葱鸡 [3]益肝青苔:");
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


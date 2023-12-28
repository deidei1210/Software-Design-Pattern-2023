package Command;

import Adapter.AliAdapter;
import Adapter.CardPay;
import Adapter.WechatPay;
import Memento.CareTaker;
import Decorator.Book;
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

        System.out.println("\n欢迎来到顶峰考研云教辅资料采购中心，我们为您准备了丰富多样的教辅资料可以采购，请问您想采购些什么？");
        System.out.println("[0]跑路 [1]2025考研数学武忠祥 [2]考研政治肖秀荣 [3]考研英语红宝书:");
        int i;
        int money=0;//目前的花费
        //选择需要采购的教材
        Scanner scan_input = new Scanner(System.in);
        i = scan_input.nextInt();
        boolean isOrder = false;  //判断是否点单成功
        while (i != 0) {
            money=0;
            switch (i) {
                case 1: {
                    //2025考研数学武忠祥
                    CareTaker orderList = new CareTaker();
                    Command orderMathBook = new OrderMathBookCommand();
                    orderMathBook.execute();
                    Book myMathBook = orderMathBook.getMyBook();
                    orderList.append(orderMathBook, myMathBook.createMemento());
                    money+= orderMathBook.getPrice();  //总花费加上数学书的价格
                    System.out.println("您目前的总价为: " + money);
                    //进行学习材料的采购
                    OrderStudyMaterials MathBookStudyMaterials = new OrderStudyMaterials(orderList, myMathBook);
                    isOrder = MathBookStudyMaterials.start();
                    money+=MathBookStudyMaterials.getStudyMaterialMoney();
                    break;
                }
                case 2: {
                    //考研政治肖秀荣
                    CareTaker orderList = new CareTaker();
                    Command orderPoliticBook = new OrderPoliticBookCommand();
                    orderPoliticBook.execute();
                    Book myPoliticBook = orderPoliticBook.getMyBook();
                    orderList.append(orderPoliticBook, myPoliticBook.createMemento());
                    money+= orderPoliticBook.getPrice();  //总花费加上数学书的价格
                    System.out.println("您目前的总价为: " + money);
                    //进行学习材料的采购
                    OrderStudyMaterials politicBookStudyMaterials = new OrderStudyMaterials(orderList, myPoliticBook);
                    isOrder = politicBookStudyMaterials.start();
                    money+= politicBookStudyMaterials.getStudyMaterialMoney();
                    break;
                }
                case 3: {
                    //考研英语红宝书
                    CareTaker orderList = new CareTaker();
                    Command orderEnglishBook = new OrderEnglishBookCommand();
                    orderEnglishBook.execute();
                    Book myEnglishBook = orderEnglishBook.getMyBook();
                    orderList.append(orderEnglishBook, myEnglishBook.createMemento());
                    money+= orderEnglishBook.getPrice();  //总花费加上数学书的价格
                    System.out.println("您目前的总价为: " + money);
                    //进行学习材料的采购
                    OrderStudyMaterials englishBookStudyMaterials = new OrderStudyMaterials(orderList, myEnglishBook);
                    isOrder = englishBookStudyMaterials.start();
                    money+= englishBookStudyMaterials.getStudyMaterialMoney();
                    System.out.println("您目前的总价为: " + money);
                    break;
                }
                default:
                    break;
            }
            i = 0;
            if (!isOrder) {
                System.out.println("\n欢迎来到顶峰考研云教辅资料采购中心，我们为您准备了丰富多样的教辅资料可以采购，请问您想采购些什么？");
                System.out.println("[0]跑路 [1]2025考研数学武忠祥 [2]考研政治肖秀荣 [3]考研英语红宝书:");
                i = scan_input.nextInt();
            }
        }
        //如果点单成功，则进行支付
        if (isOrder) {
            System.out.println("您目前的总价为: " + money);
            Price price = new Price();
            price.SetOriPrice(money);
            price.SetExchange(money);
//            System.out.println("目前汇率 —— 1:5");
            OriginalPrice oriPriceInterpreter = new OriginalPrice();
            oriPriceInterpreter.Method(price);
            float result;
            ExchangePrice discountPriceInterpreter = new ExchangePrice();
            result = discountPriceInterpreter.Method(price);
//            System.out.println("现价为：" + result);
            Scanner scan = new Scanner(System.in);
            int type;
            System.out.println("请选择你要使用的支付方式：\n1、Ali支付  2、WeChat支付 3、银行卡支付");
            type = scan.nextInt();
            switch (type) {
                case 1: {
                    //使用支付宝
                    new AliAdapter().pay(money);
                    break;
                }
                case 2: {
                    //使用微信
                    new WechatPay().pay(money);
                    break;
                }
                case 3:{
                    //使用银行卡
                    new CardPay().pay(money);
                    break;
                }
            }
            return true;
        }
        return false;
    }
}


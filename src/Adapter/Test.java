package Adapter;

import java.util.Scanner;

public class Test {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int type;
        System.out.println("请选择你要使用的支付方式：\n1、Ali支付  2、WeChat支付 3、银行卡支付");
        type = scan.nextInt();
        switch (type) {
            case 1: {
                new AliAdapter().pay(19);
                break;
            }
            case 2: {
                new WechatPay().pay(19);
                break;
            }
            case 3:{
                new CardPay().pay(19);
                break;
            }
        }
    }
}

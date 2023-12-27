package Adapter_new;

import Adapter_new.Pay;

import java.util.Scanner;

public class CardPay implements Pay {
    //银行卡支付类
//    int money=0;
    Scanner scan = new Scanner(System.in);

    public void pay(int money) {
        System.out.println("您选择了使用银行卡进行支付");
//        int money = 100;
        System.out.println("你通过银行卡支付了" + money + "元");
    }

}
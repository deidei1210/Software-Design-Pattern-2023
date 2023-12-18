package Adapter_new;

import Adapter.Pay;

import java.util.Scanner;

public class CardPay implements Pay {
    //银行卡支付类

    Scanner scan = new Scanner(System.in);
    private int money;

    public void pay() {
        System.out.println("您选择了使用银行卡进行支付");
        money = 100;
    }

}
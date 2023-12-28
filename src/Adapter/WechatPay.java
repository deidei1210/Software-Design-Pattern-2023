package Adapter;

import java.util.Scanner;

public class WechatPay implements Pay {
    //微信支付类

    Scanner scan = new Scanner(System.in);
//    private int money;

    public void pay(int money) {
        System.out.println("你选择了使用WeChat支付");
//        money = 100;
        System.out.println("你通过WeChat支付了" + money + "元");
    }

}


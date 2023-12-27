package Adapter_new;

import java.util.Scanner;

public class AliPay {
    //支付宝的特殊支付模式
//    int money;
    Scanner scan = new Scanner(System.in);
    private final int type;

    public AliPay() {
//        this.money=money;
        System.out.println("你选择了使用Alipay支付");
        //接受用户的输入
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择Alipay的支付功能：\n1、余额  2、花呗");
        type = scan.nextInt();
    }

    public void specialPay(int money) {

        if (type == 1) {
            System.out.println("选择余额付款");
//            money = 100;
            System.out.println("你通过Alipay的余额支付了" + money + "元");
        } else if (type == 2) {
            System.out.println("选择花呗付款");
//            money = 100;
            System.out.println("你通过Alipay的花呗支付了" + money + "元");
        }
    }
}
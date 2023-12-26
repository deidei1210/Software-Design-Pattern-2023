import Singleton_LazyInitialization.BoiledCodfishCarnivalWithCheese;
import Singleton_LazyInitialization.MainTest;

import java.util.Scanner;

//项目主函数
public class main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        System.out.println("欢迎来到芝士煲鳕嘉年华模拟系统！");
        System.out.println("选择启动模式 [1]进入体验 [2]测试软件设计模式");
        Scanner input = new Scanner(System.in);
        int opt = input.nextInt();
        if (opt == 1) {
            BoiledCodfishCarnivalWithCheese BCWC = BoiledCodfishCarnivalWithCheese.getInstance();
            //开启BCWC流程
            BCWC.flowController();
        } else if (opt == 2) {
            MainTest.getInstance().TestController();
        }
    }
}
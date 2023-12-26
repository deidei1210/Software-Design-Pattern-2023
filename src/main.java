import Singleton_LazyInitialization.BoiledCodfishCarnivalWithCheese;
import Singleton_LazyInitialization.MainTest;

import java.util.Scanner;

//项目主函数
public class main {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        //输出提示
        System.out.println("欢迎来到顶峰考研云在线考研模拟考试系统！");
        System.out.println("选择想要进行的项目 [1]进入体验 [2]测试软件设计模式");
        //选择想要进行的模式
        Scanner input = new Scanner(System.in);
        int opt = input.nextInt();
        //选择的是进入体验，即一行一行进行
        if (opt == 1) {
            BoiledCodfishCarnivalWithCheese BCWC = BoiledCodfishCarnivalWithCheese.getInstance();
            //开启BCWC流程
            BCWC.flowController();
            //直接进行软件设计模式的测试
        } else if (opt == 2) {
            MainTest.getInstance().TestController();
        }
    }
}
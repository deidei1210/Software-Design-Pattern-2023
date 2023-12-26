package Prototype;


import java.util.Scanner;

public class PrototypeFunction {
    public static void PrototypeFn() throws CloneNotSupportedException {
        FansCache.loadCache();

        System.out.println("请选择要接见的观众的种类：[1]EDG [2]IG [3]RNG" + '\n' + "输入:[view]查看观众数量 [q]离开" );
        int counter = 0;
        int edgCounter = 0;
        int igCounter = 0;
        int rngCounter = 0;
        String str = "";
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            Fans clonedFans = FansCache.getFans("1");

            switch (str) {
                case "1": {
                    edgCounter++;
                    counter++;
                    System.out.println("Here is a EDGFans");
                }
                break;
                case "2": {
                    igCounter++;
                    counter++;
                    System.out.println("Here is a IGFans");
                }
                break;
                case "3": {
                    rngCounter++;
                    counter++;
                    System.out.println("Here is a RNGFans");
                }
                break;
                case "view": {
                    System.out.println("The number of Fans:" + counter);
                    System.out.println("The number of edgFans:" + edgCounter);
                    System.out.println("The number of igFans:" + igCounter);
                    System.out.println("The number of rngFans:" + rngCounter);
                }
                break;
                case "q": {
                    flag = false;
                }
                break;
                default: {
                    System.out.println("Invalid input,please try again!");
                }
                break;
            }
        }
    }
}

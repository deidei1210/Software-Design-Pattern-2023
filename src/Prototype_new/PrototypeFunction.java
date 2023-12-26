package Prototype_new;


//import Prototype_new.MemberCache;

//import Prototype.Member;
//import Prototype.MemberCache;

import java.util.Map;
import java.util.Scanner;

public class PrototypeFunction {
    public static void PrototypeFn() throws CloneNotSupportedException {
        MemberCache.loadCache();

        System.out.println("请选择要查看的学习小组的学科：\"Math\" \"English\" \"Politics\"" );
        System.out.println("输入:[view]查看学习小组人数 [quit]离开" );
        int counter = 0;
        Map<String,Integer> subjectCounter = new java.util.HashMap<>(Map.of(
                "Math", 0,
                "English", 0,
                "Politics", 0
        ));
        String str = "";
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            str = scanner.nextLine();
            Member clonedMember = MemberCache.getMember("1");
            if(subjectCounter.containsKey(str)) {
                subjectCounter.put(str,subjectCounter.get(str)+1);
                counter++;
                System.out.println("Here is a "+str+"Member");
            }
            else {
                switch (str) {
                    case "view": {
                        System.out.println("The number of Members:" + counter);
                        for(String subject:subjectCounter.keySet()) {
                            System.out.println("The number of "+subject+"Member:"+subjectCounter.get(subject));
                        }
                        break;
                    }
                    case "quit": {
                        flag = false;
                        break;
                    }
                    default: {
                        System.out.println("Invalid input,please try again!");
                        break;
                    }
                }
            }
        }
    }
}

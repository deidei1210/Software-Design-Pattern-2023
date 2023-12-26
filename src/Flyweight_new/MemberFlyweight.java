package Flyweight;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Prototype.Member;

public class MemberFlyweight {
    private static final String[] School = {
            "School of Software Engineering",
            "School of Automotive Studies",
            "School of Economy Management",
            "School of Medicine",
            "School of Mathematical Sciences"
    };
    private static final String[] Subject = {
            "Math",
            "English",
            "Politics"
    };

    public static void main(String[] args) {
        System.out.println("Please enter the subject of the group!");
        System.out.println("Input \"Math\" \"English\" \"Politics\" to choose subject");
        System.out.println("Input \"view\" to view the counter!");
        System.out.println("Input \"detail\" to view the detail member!");
        System.out.println("Input \"quit\" to quit!");
        Map<String, Integer> GroupMemberCounter = Map.of(
                "Math",0,
                "English",0,
                "Politics",0
        );
        Map<String, Map<String, Integer>> SchoolCounter = Map.of(
                "Math",new HashMap<>(),
                "English", new HashMap<>(),
                "Politics", new HashMap<>()
        );
        int counter = 0;
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            boolean isKey = false;
            for (String key : SchoolCounter.keySet()) {
                if (str.equals(key)) {
                    isKey = true;
                    break;
                }
            }
            if (isKey) {
                String school = getRandomAim();
                SchoolCounter.get(str).put(school, SchoolCounter.get(str).get(school) + 1);
                GroupMemberCounter.put(str, GroupMemberCounter.get(str) + 1);
                counter++;
                Member groupMember = Flyweight.AttributeFactory.setMember(str,school);
                groupMember.setAge(getRandomAge());
                groupMember.setSex(getRandomSex());
                groupMember.printSubject();
            }else{
                switch (str){
                    case "detail": {
                        for(String subject:Subject){
                            for(String school:School){
                                System.out.println(school + " " +subject+"Member:"+SchoolCounter.get(subject).get(school));
                            }
                        }
                        break;
                    }
                    case "view": {
                        System.out.println("The number of Members:" + counter);
                        for(String subject:Subject){
                            System.out.println("The number of "+subject+"Members:" + GroupMemberCounter.get(subject));
                        }
                        break;
                    }
                    case "quit": {
                        flag = false;
                        break;
                    }
                    default: {
                        System.out.println("Invalid input,please try again!");
                    }
                }
            }
        }
    }


    public static String getRandomAim() {
        return School[(int) (Math.random() * School.length)];
    }

    public static int getRandomAge() {
        int maxAge = 30;
        int minAge = 12;
        return minAge + (int) (Math.random() * maxAge);
    }

    public static String getRandomSex() {
        if (((Math.random() * 100) % 2) == 1) {
            return "MALE";
        } else {
            return "FEMALE";
        }
    }
}

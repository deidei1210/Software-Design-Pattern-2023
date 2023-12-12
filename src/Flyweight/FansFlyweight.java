package Flyweight;


import java.util.Scanner;

import Prototype.EDGFans;
import Prototype.IGFans;
import Prototype.RNGFans;

public class FansFlyweight {
    private static final String nations[] =
            { "China", "American","Japan", "Korea", "EU"};

    public static void main(String[] args) {
        System.out.println("Please enter the club of the fans!");
        System.out.println("\"1\":EDGFans \"2\":IGFans \"3\":RNGFans");
        System.out.println("Input \"view\" to view the counter!");
        System.out.println("Input \"detail\" to view the detail audience!");
        System.out.println("Input \"Q\" to quit!");
        int counter = 0;
        int edgCounter = 0;
        int[] edgFansCounter = new int[5];
        int igCounter = 0;
        int[] igFansCounter = new int[5];
        int rngCounter = 0;
        int[] rngFansCounter = new int[5];
        String str = "";
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            str = sc.nextLine();
            switch (str) {
                case "1": {
                    String nation = getRandomNation();
                    if (nation == "China") {
                        edgFansCounter[0]++;
                    } else if (nation == "American") {
                        edgFansCounter[1]++;
                    } else if (nation == "Japan") {
                        edgFansCounter[2]++;
                    } else if (nation == "Korea") {
                        edgFansCounter[3]++;
                    } else if (nation == "EU") {
                        edgFansCounter[4]++;
                    }
                    EDGFans edgFans = (EDGFans) Flyweight.AttributeFactory.setEDGFans(nation);
                    edgFans.setAge(getRandomAge());
                    edgFans.setSex(getRandomSex());
                    edgFans.printClub();
                    edgCounter++;
                    counter++;
                }
                break;
                case "2": {
                    String nation = getRandomNation();
                    if (nation == "China") {
                        igFansCounter[0]++;
                    } else if (nation == "American") {
                        igFansCounter[1]++;
                    } else if (nation == "Japan") {
                        igFansCounter[2]++;
                    } else if (nation == "Korea") {
                        igFansCounter[3]++;
                    } else if (nation == "EU") {
                        igFansCounter[4]++;
                    }
                    IGFans igFans = (IGFans) Flyweight.AttributeFactory.setIGFans(nation);
                    igFans.setAge(getRandomAge());
                    igFans.setSex(getRandomSex());
                    igFans.printClub();
                    igCounter++;
                    counter++;
                }
                break;
                case "3": {
                    String nation = getRandomNation();
                    if (nation == "China") {
                        rngFansCounter[0]++;
                    } else if (nation == "American") {
                        rngFansCounter[1]++;
                    } else if (nation == "Japan") {
                        rngFansCounter[2]++;
                    } else if (nation == "Korea") {
                        rngFansCounter[3]++;
                    } else if (nation == "EU") {
                        rngFansCounter[4]++;
                    }
                    RNGFans rngFans = (RNGFans) Flyweight.AttributeFactory.setRNGFans(nation);
                    rngFans.setAge(getRandomAge());
                    rngFans.setSex(getRandomSex());
                    rngFans.printClub();
                    rngCounter++;
                    counter++;
                }
                break;
                case "detail": {
                    System.out.println("China EDGFans:" + edgFansCounter[0] + ", American EDGFans:" + edgFansCounter[1] +
                            ", Japan EDGFans:" + edgFansCounter[2] + ", Korea EDGFans:" + edgFansCounter[3] +
                            ", EU EDGFans:" + edgFansCounter[4]);
                    System.out.println("China IGFans:" + igFansCounter[0] + ", American IGFans:" + igFansCounter[1] +
                            ", Japan IGFans:" + igFansCounter[2] + ", Korea IGFans:" + igFansCounter[3] +
                            ", EU IGFans:" + igFansCounter[4]);
                    System.out.println("China RNGFans:" + rngFansCounter[0] + ", American RNGFans:" + rngFansCounter[1] +
                            ", Japan RNGFans:" + rngFansCounter[2] + ", Korea RNGFans:" + rngFansCounter[3] +
                            ", EU RNGFans:" + rngFansCounter[4]);
                }
                break;
                case "view": {
                    System.out.println("The number of Fans:" + counter);
                    System.out.println("The number of EDGFans:" + edgCounter);
                    System.out.println("The number of IGFans:" + igCounter);
                    System.out.println("The number of RNGFans:" + rngCounter);
                }
                break;
                case "Q": {
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


    public static String getRandomNation() {
        return nations[(int) (Math.random() * nations.length)];
    }

    public static int getRandomAge() {
        int maxAge = 100;
        int minAge = 18;
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

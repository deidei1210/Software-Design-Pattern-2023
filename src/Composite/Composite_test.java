package Composite;



public class Composite_test {
    public static void main(String[] args) {
        System.out.println("组合模式（Composite Pattern）");
        System.out.println("包:Composite");
        System.out.println("类：MenuOption");
        System.out.println("实现接口：printMenu()");
        System.out.println("测试信息：");
        //设置测试用菜单
        Menu rootMenu = new Menu("功能选择");
        //第一个比赛菜单
        Menu gameMenu = new Menu("测试选项");
        //创建三个比赛实例

        MenuOption forwardWatch = new MenuOption("功能1",1);
        MenuOption heroOfFan = new MenuOption("功能2", 2);
        MenuOption mgaicWarCraft = new MenuOption("功能3", 3);
        MenuOption seaCraft = new MenuOption("功能4", 4);
        MenuOption loreOfLU = new MenuOption("功能5", 5);
        MenuOption contest = new MenuOption("功能6", 6);
        // 向比赛菜单中添加五个选项
        // 可在此处创建五个比赛实例替换 Add 中参数 element  后续同理
        gameMenu.add(forwardWatch);
        gameMenu.add(heroOfFan);
        gameMenu.add(mgaicWarCraft);
        gameMenu.add(seaCraft);
        gameMenu.add(loreOfLU);
        gameMenu.add(contest);

        MenuOption canteen = new MenuOption("测试一", 1);
        MenuOption queryRank = new MenuOption("测试二", 2);
        MenuOption buyEquipment = new MenuOption("测试三", 3);
        MenuOption printRank = new MenuOption("测试四", 4);
        MenuOption meetAudience = new MenuOption("测试五", 5);

        rootMenu.add(gameMenu);
        rootMenu.add(canteen);
        rootMenu.add(queryRank);
        rootMenu.add(buyEquipment);
        rootMenu.add(printRank);
        rootMenu.add(meetAudience);
        // 菜单以及选择返回
        System.out.println("打印一级菜单：");
        rootMenu.printMenu();
        System.out.println("打印二级菜单：");
        gameMenu.printMenu();
        System.out.println();
    }
}

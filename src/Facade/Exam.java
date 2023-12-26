package Facade;

public class Exam {
    //体检
    public void dosomething() {
        System.out.println("玩家体检...");
        System.out.println("你的俱乐部：" + PlayerContainer.getInstance().get(0).getPlayerClub().getClub());
        System.out.println("你的国籍：" + PlayerContainer.getInstance().get(0).getPlayerNationality().getNationality());
        System.out.println("你的手速能力值：" + PlayerContainer.getInstance().get(0).getHandspeed());
        System.out.println("你的反应能力值：" + PlayerContainer.getInstance().get(0).getReaction());
        System.out.println("你的智力能力值：" + PlayerContainer.getInstance().get(0).getIntelligence());
        System.out.println("你的耐力能力值：" + PlayerContainer.getInstance().get(0).getEndurance());
        System.out.println("你的运气能力值：" + PlayerContainer.getInstance().get(0).getLuck());
    }
}

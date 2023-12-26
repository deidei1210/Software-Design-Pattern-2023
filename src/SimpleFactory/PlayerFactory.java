package SimpleFactory;

import State.StateGood;

import java.util.Random;

public class PlayerFactory {
    //创建并初始化运动员
    public Player createPlayer(String club, String nationality) {
        Random r = new Random();
        GameIngredientFactory gameIngredientFactory = new GameIngredientFactory();
        Player player = new Player();
        player.setPlayerClub(gameIngredientFactory.setClub(club));
        player.setPlayerNationality(gameIngredientFactory.setNationality(nationality));
        String str1[]={"ClearLove","Meiko","Scout","Viper","Pawn","Deft","JackeyLove","The Shy","Nuguri","Madlife","Rookie","Ning","Xiaohu","UZI","MLXG","Ming","Doinb","Faker"};
        int choose=r.nextInt(1);
        String name="JJW";
        if(club=="EDG"){
            if(nationality=="China")
                name=str1[choose];
            else if(nationality=="America")
                name=str1[choose+2];
            else if(nationality=="Japan")
                name=str1[choose+4];
        }
        else if(club=="IG"){
            if(nationality=="China")
                name=str1[choose+6];
            else if(nationality=="America")
                name=str1[choose+8];
            else if(nationality=="Japan")
                name=str1[choose+10];
        }
        else if(club=="RNG"){
            if(nationality=="China")
                name=str1[choose+12];
            else if(nationality=="America")
                name=str1[choose+14];
            else if(nationality=="Japan")
                name=str1[choose+16];
        }
        player.setPlayerName(name);
        if (player.getPlayerClub().getClub() == "IG") {
            player.setReaction(106+(r.nextInt(20)-10));
            player.setHandspeed(98+(r.nextInt(20)-10));
            player.setLuck(94+(r.nextInt(20)-10));
            player.setEndurance(104+(r.nextInt(20)-10));
            player.setIntelligence(100+(r.nextInt(20)-10));
        } else if (player.getPlayerClub().getClub() == "EDG") {
            player.setReaction(103+(r.nextInt(10)-5));
            player.setHandspeed(99+(r.nextInt(10)-5));
            player.setLuck(100+(r.nextInt(10)-5));
            player.setEndurance(101+(r.nextInt(10)-5));
            player.setIntelligence(95+(r.nextInt(10)-5));
        } else if (player.getPlayerClub().getClub() == "RNG") {
            player.setReaction(98+(r.nextInt(14)-7));
            player.setHandspeed(104+(r.nextInt(14)-7));
            player.setLuck(99+(r.nextInt(14)-7));
            player.setEndurance(108+(r.nextInt(14)-7));
            player.setIntelligence(102+(r.nextInt(14)-7));
        }
        player.setRank(new int[]{0, 0, 0});
        player.setScore(new double[]{0, 0, 0});
        player.setPlayerState(new StateGood());
        return player;
    }

}

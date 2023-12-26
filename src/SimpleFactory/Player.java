package SimpleFactory;

import State.PlayerState;

public class Player {
    private String PlayerName;
    private Club playerClub;
    private Nationality playerNationality;
    private double reaction;
    private double handspeed;
    private double luck;
    private double endurance;
    private double intelligence;
    private PlayerState playerState;
    private int[] Rank;
    private double[] Score;

    public Player() {
    }

    //构造函数（不会调用，仅作为比较）
    private Player(Club club, Nationality nationality) {
        playerClub = club;
        playerNationality = nationality;
        PlayerName = playerNationality.getNationality() + playerClub.getClub();
        if (club.getClub() == "IG") {
            reaction = 106;
            handspeed = 98;
            luck = 96;
            endurance = 104;
            intelligence = 100;
        } else if (club.getClub() == "EDG") {
            reaction = 103; 
            handspeed = 99;
            luck = 100;
            endurance = 101;
            intelligence = 95;
        } else if (club.getClub() == "RNG") {
            reaction = 98;
            handspeed = 104;
            luck = 99;
            endurance = 108;
            intelligence = 102;
        }
    }

    //getter & stter
    public double getReaction() {
        return reaction;
    }

    public void setReaction(double reaction) {
        this.reaction = reaction;
    }

    public double getHandspeed() {
        return handspeed;
    }

    public void setHandspeed(double handspeed) {
        this.handspeed = handspeed;
    }

    public double getLuck() {
        return luck;
    }

    public void setLuck(double luck) {
        this.luck = luck;
    }

    public double getEndurance() {
        return endurance;
    }

    public void setEndurance(double endurance) {
        this.endurance = endurance;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }


    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public Nationality getPlayerNationality() {
        return playerNationality;
    }

    public void setPlayerNationality(Nationality animalNationality) {
        this.playerNationality = animalNationality;
    }

    public Club getPlayerClub() {
        return playerClub;
    }

    public void setPlayerClub(Club playerClub) {
        this.playerClub = playerClub;
    }

    public int[] getRank() {
        return Rank;
    }

    public void setRank(int[] rank) {
        Rank = rank;
    }

    public double[] getScore() {
        return Score;
    }

    public void setScore(double[] score) {
        Score = score;
    }

    public PlayerState getPlayerState() {
        return playerState;
    }

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }

    //输出测试信息
    public void showPlayerInfo() {
        System.out.println("Name is " + PlayerName + "!");
        playerClub.getClub();
        playerNationality.getNationality();
    }

}

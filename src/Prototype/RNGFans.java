package Prototype;

public class RNGFans extends Fans {
    public RNGFans() {
        this.club = "RNGFans";
    }

    public RNGFans(String nation) {
        this.club =  "RNGFans";
        this.nation =nation;
    }

    @Override
    public String printClub() {
        String info = "This is a RNGFans" + ", Nation is " + nation + ", Age is " + age + ", Sex is" + sex;
        System.out.println(info);
        return info;
    }
}

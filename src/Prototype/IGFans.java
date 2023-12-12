package Prototype;

public class IGFans extends Fans {
    public IGFans() {
        this.club = "IGFans";
    }

    public IGFans(String nation) {
        this.club = "IGFans";
        this.nation =nation;
    }

    @Override
    public String printClub() {
        String info = "This is a IGFans" + ", Nation is " + nation + ", Age is " + age + ", Sex is" + sex;
        System.out.println(info);
        return info;
    }
}

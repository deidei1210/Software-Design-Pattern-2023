package Prototype;

public class EDGFans extends Fans {
    public EDGFans() {
        this.club = "EDGFans";
    }

    public EDGFans(String nation) {
        this.club = "EDGFans";
        this.nation =nation;
    }

    @Override
    public String printClub() {
        String info = "This is a EDGFans" + ", Nation is " + nation + ", Age is " + age + ", Sex is" + sex;
        System.out.println(info);
        return info;
    }
}

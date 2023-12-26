package Prototype;

public abstract class Fans implements Cloneable{
    public String nation;
    protected String club;
    protected String sex;
    protected int age;
    private String id;

    //public Fans() {
    //    Random random = new Random();
    //    this.sex = random.nextInt() > 0.5 ?"男":"女";
    //    this.age = (random.nextInt(82) + 18) + "岁";
    //}

    public abstract String printClub();

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

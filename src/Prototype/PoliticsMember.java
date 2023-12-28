package Prototype;

public class PoliticsMember extends Member {
    public PoliticsMember() {
        this.subject = this.getClass().toString();
    }

    public PoliticsMember(String nation) {
        this.subject = this.getClass().toString();
        this.school =nation;
    }

    @Override
    public void printSubject() {
        String info = "This is a "+subject + ", School is " + school + ", Age is " + age + ", Sex is" + sex;
        System.out.println(info);
    }
}

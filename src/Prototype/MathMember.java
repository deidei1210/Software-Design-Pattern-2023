package Prototype;

public class MathMember extends Member {
    public MathMember() {
        this.subject = this.getClass().toString();
    }

    public MathMember(String school) {
        this.subject = this.getClass().toString();
        this.school =school;
    }

    @Override
    public void printSubject() {
        String info = "This is a "+subject + ", School is " + school + ", Age is " + age + ", Sex is" + sex;
        System.out.println(info);
    }
}

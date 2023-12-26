package Prototype_new;

import Prototype.Member;

public class EnglishMember extends Member {
    public EnglishMember() {

        this.subject = this.getClass().toString();
    }

    public EnglishMember(String school) {
        this.subject =  this.getClass().toString();
        this.school = school;
    }

    @Override
    public void printSubject() {
        String info = "This is a "+subject + ", School is " + school + ", Age is " + age + ", Sex is" + sex;
        System.out.println(info);
    }
}

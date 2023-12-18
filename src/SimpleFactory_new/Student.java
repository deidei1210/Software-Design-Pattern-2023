package SimpleFactory_new;

import State_new.StudentState;

public class Student {
    private String studentName;                         //学生的姓名
    private Nationality studentNationality;             //学生的国籍（真的会有外国人使用系统吗？
    private EducationalLevel studentEducationalLevel;    
    //TODO: 思考通过什么类似下面的属性来决定考试分数
    private double reaction;
    private double handspeed;
    private double luck;
    private double endurance;
    private double intelligence;
    private StudentState studentState;
    private int[] Rank;
    private double[] Score;

    public Student() {
    }

    //构造函数（不会调用，仅作为比较）
    private Student(EducationalLevel educationalLevel, Nationality nationality) {
        studentEducationalLevel = educationalLevel;
        studentNationality = nationality;
        studentName = studentNationality.getNationality() + studentEducationalLevel.getEducationalLevel();
        // 临时设置成这样（by hjr），仅为方便别的类开发用
        reaction = 106;
        handspeed = 98;
        luck = 96;
        endurance = 104;
        intelligence = 100;
//        if (educationalLevel.getEducationalLevel() == "IG") {
//            reaction = 106;
//            handspeed = 98;
//            luck = 96;
//            endurance = 104;
//            intelligence = 100;
//        } else if (educationalLevel.getEducationalLevel() == "EDG") {
//            reaction = 103;
//            handspeed = 99;
//            luck = 100;
//            endurance = 101;
//            intelligence = 95;
//        } else if (educationalLevel.getEducationalLevel() == "RNG") {
//            reaction = 98;
//            handspeed = 104;
//            luck = 99;
//            endurance = 108;
//            intelligence = 102;
//        }
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


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        studentName = studentName;
    }

    public Nationality getStudentNationality() {
        return studentNationality;
    }

    public void setStudentNationality(Nationality animalNationality) {
        this.studentNationality = animalNationality;
    }

    public EducationalLevel getStudentEducationalLevel() {
        return studentEducationalLevel;
    }

    public void setStudentEducationalLevel(EducationalLevel studentEducationalLevel) {
        this.studentEducationalLevel = studentEducationalLevel;
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

    public StudentState getStudentState() {
        return studentState;
    }

    public void setStudentState(StudentState studentState) {
        this.studentState = studentState;
    }

    //输出测试信息
    public void showStudentInfo() {
        System.out.println("Name is " + studentName + "!");
        studentEducationalLevel.getEducationalLevel();
        studentNationality.getNationality();
    }

}

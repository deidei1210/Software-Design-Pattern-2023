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

    private String major;

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


    //获取学生的姓名
    public String getStudentName() {
        return studentName;
    }

    //设置学生的姓名
    public void setStudentName(String studentName) {
        studentName = studentName;
    }

    //获取学生的国籍
    public Nationality getStudentNationality() {
        return studentNationality;
    }

    //设置学生的国籍
    public void setStudentNationality(Nationality animalNationality) {
        this.studentNationality = animalNationality;
    }

    //获取学生的教育程度
    public EducationalLevel getStudentEducationalLevel() {
        return studentEducationalLevel;
    }

    //设置学生的教育程度
    public void setStudentEducationalLevel(EducationalLevel studentEducationalLevel) {
        this.studentEducationalLevel = studentEducationalLevel;
    }

    //获取学生的排名
    public int[] getRank() {
        return Rank;
    }

    //设置学生的排名
    public void setRank(int[] rank) {
        Rank = rank;
    }

    //获取学生的成绩
    public double[] getScore() {
        return Score;
    }

    //设置学生的成绩
    public void setScore(double[] score) {
        Score = score;
    }

    //获取学生此时的状态
    public StudentState getStudentState() {
        return studentState;
    }

    //获取学生的状态
    public void setStudentState(StudentState studentState) {
        this.studentState = studentState;
    }

    //设置学生的专业
    public void setStudentMjor(String major){
        this.major=major;
    }
    //获取学生的专业
    public String getStudentMajor(){
        return this.major;
    }

    //输出测试信息
    public void showStudentInfo() {
        System.out.println("Name is " + studentName + "!");
        studentEducationalLevel.getEducationalLevel();
        studentNationality.getNationality();
    }

}

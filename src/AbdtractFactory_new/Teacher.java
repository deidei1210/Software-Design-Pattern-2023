package AbdtractFactory_new;

public class Teacher {
    private String TeacherName;
    private ExamType examType;
    private Gender gender;

    private TeacherIngredientFactory ExamTypeFactory;
    private TeacherIngredientFactory GenderFactory;

    public TeacherIngredientFactory getExamTypeFactory(){return ExamTypeFactory;}
    public TeacherIngredientFactory getGenderFactory(){return GenderFactory;}

    public void setFactory(TeacherIngredientFactory EFactory,TeacherIngredientFactory GFactory)
    {
        this.ExamTypeFactory=EFactory;
        this.GenderFactory=GFactory;
    }

    public String getTeacherName(){return TeacherName;}

    public void setTeacherName(String Tname){this.TeacherName=Tname;}

    public ExamType getExamType(){return this.examType;}
    public void setExamType(ExamType Etype){this.examType=Etype;}

    public Gender getGender(){return this.gender;}
    public void setGender(Gender gender){this.gender=gender;}
}

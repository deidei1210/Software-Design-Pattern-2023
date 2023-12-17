package AbstractFactory_new;

public class ExamFactory implements TeacherIngredientFactory {
    @Override
    public ExamType CreateExam(String name){
        switch(name){
            case "WoMa":
            case "MaMa": //高等数学
                return new HigherMathematics();

            case "WoPo":
            case "MaPo": //大学政治
                return new Politics();

            case "WoCp":
            case "MaCp":
                return new ComputerProfessionalCourse408();

            case "WoEn":
            case "MaEn":
                return new CollegeEnglish();

        }
        return null;
    }

    @Override
    public Gender CreateGender(String name)
    {
        return null;
    }
}

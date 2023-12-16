package AbdtractFactory_new;

public class TeacherFactory implements TeacherIngredientFactory{
    @Override
    public ExamType CreateExam(String name){return null;}

    @Override
    public Gender CreateGender(String name)
    {
        switch(name){
            case "WoMa":
            case "WoPo":
            case "WoCp":
            case "WoEn":
                return new Woman();
            case "MaMa":
            case "MaPo":
            case "MaCp":
            case "MaEn":
                return new Man();

        }
        return null;
    }
}

package AbstractFactory_new;

public interface TeacherIngredientFactory {
    ExamType CreateExam(String name);

    Gender CreateGender(String name);

}
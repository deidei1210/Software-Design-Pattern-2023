package MVC_new;


import SimpleFactory_new.Student;

public class StudentController {
    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView views) {
        this.model = model;
        this.view = views;
    }


    public void setStudentName(String name){
        model.setStudentName(name);
    }

    public String getStudentName(){
        return model.getStudentName();
    }

    public void updateView(){
        view.printStudentDetails(model.getStudentName());
    }
}

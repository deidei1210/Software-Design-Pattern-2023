package MVC_new;

public class StudentController {
    private Student model;
    private StudentViews view;

    public StudentController(Student model, StudentViews views) {
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

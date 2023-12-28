package MVC_new;


import MVC_new.StudentController;
import MVC_new.StudentView;
import SimpleFactory_new.Student;
import SimpleFactory_new.StudentFactory;

import java.util.Scanner;

public class MVCPattern {
    public static void main(String[] args) {
        Student model = getStudent();

        StudentView views = new StudentView();

        StudentController controller = new StudentController(model,views);

        controller.updateView();

        String str;
        System.out.println("请输入一个新名字:");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        controller.setStudentName(str);

        controller.updateView();
    }

    private static Student getStudent(){
        return new StudentFactory().createStudent("Granduates", "Japan");
    }
}

package MVC;


import SimpleFactory.Student;
import SimpleFactory.StudentFactory;

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

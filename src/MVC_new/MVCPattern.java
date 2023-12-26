package MVC_new;

import java.util.Scanner;

public class MVCPattern {
    public static void main(String[] args) {
        Student model = getStudent();

        StudentViews views = new StudentViews();

        StudentController controller = new StudentController(model,views);

        controller.updateView();

        String str;
        System.out.println("请输入新名字:");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        controller.setStudentName(str);

        controller.updateView();
    }

    private static Student getStudent(){
        return new StudentFactory().createStudent("Undergraduate", "Domestic");
    }
}

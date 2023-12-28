package AbstractFactory;
public class AbstractFactory_test {
    public static void main(String[] args){
        System.out.println("抽象工厂模式（Abstract Factory Pattern）测试，测试功能为教师创建");
        System.out.println("包:AbstractFactory");
        System.out.println("类：TeacherStore");
        System.out.println("实现接口：Teacher teacher = TeacherStore.getInstance().orderTeacher(\"WoMa\");");
        System.out.println("测试信息：");
        Teacher teacher = TeacherStore.getInstance().orderTeacher("WoMa");
        teacher.setTeacherName("史扬");
        System.out.println("教师创建成功！");
        System.out.println("老师姓名：" + teacher.getTeacherName());
        System.out.println("老师性别：" + teacher.getGender().toString());
        System.out.println("监考科目：" + teacher.getExamType().toString());
        System.out.println();
    }
}

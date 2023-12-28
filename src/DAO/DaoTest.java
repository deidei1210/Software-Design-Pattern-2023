package DAO;

public class DaoTest {
    public static void main(String[] args) {//dao模式测试
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的运动员
        for (DAO.Student student : studentDao.getAllStudents()) {
            System.out.println("编号 : "
                    + student.getRollNo() + ", 姓名 : " + student.getName());
        }


        //更新运动员
        Student student = studentDao.getAllStudents().get(0);
        student.setName("TheShy");
        studentDao.updateStudent(student);

        //获取运动员
        studentDao.getStudent(0);
        System.out.println("编号 : "
                + student.getRollNo() + ", 姓名 : " + student.getName());
    }
}

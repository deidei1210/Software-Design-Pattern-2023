package SimpleFactory;

//目标专业是计算机科学与技术的学生
public class ComputerScience implements TargetMajor {
    @Override
    public String getTargetMajor() {
        return "Computer Science";
    }
}

package SimpleFactory_new;

//目标专业是其他专业的学生
public class Other implements TargetMajor{

    @Override
    public String getTargetMajor() {
        return "other major";
    }

}

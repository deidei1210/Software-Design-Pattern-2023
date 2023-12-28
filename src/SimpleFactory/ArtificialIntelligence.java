package SimpleFactory;

//目标专业是人工智能的学生
public class ArtificialIntelligence implements TargetMajor {

    @Override
    public String getTargetMajor() {
        return "artificial intelligence";
    }

}
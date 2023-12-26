package SimpleFactory_new;

public class StudentIngredientFactory {

    //设置教育水平（未毕业的本科生，已毕业的本科生（二战））
    public EducationalLevel setEducationalLevel(String educationalLevelType) {
        if (educationalLevelType == null) {
            return null;
        }
        if (educationalLevelType.equalsIgnoreCase("Undergraduate")) {
            return new Undergraduate();
        } else if (educationalLevelType.equalsIgnoreCase("Graduate")) {
            return new Graduate();
        }
        return null;
    }

    //设置学生的目标专业
    public TargetMajor setTargetMajor(String targetMajorType) {
        if (targetMajorType == null) {
            return null;
        }
        if (targetMajorType.equalsIgnoreCase("Software Engineering")) {
            return new SoftwareEngineering();
        } else if (targetMajorType.equalsIgnoreCase("Artificial Intelligence")) {
            return new ArtificialIntelligence();
        }else if(targetMajorType.equalsIgnoreCase("Computer Science")){
            return new ComputerScience();
        } else if(targetMajorType.equalsIgnoreCase("Other")) {
            return new Other();
        }
        return null;
    }
}

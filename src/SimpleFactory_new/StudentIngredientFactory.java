package SimpleFactory_new;

public class StudentIngredientFactory {

    //设置教育水平（本科生，硕士生，博士生）
    public EducationalLevel setEducationalLevel(String educationalLevelType) {
        if (educationalLevelType == null) {
            return null;
        }
        if (educationalLevelType.equalsIgnoreCase("Undergraduate")) {
            return new Undergraduate();
        } else if (educationalLevelType.equalsIgnoreCase("Graduate")) {
            return new Graduate();
        } else if (educationalLevelType.equalsIgnoreCase("PhD")) {
            return new PhD();
        }
        return null;
    }

    //设置国籍（国内学生和国际学生）
    public Nationality setNationality(String nationalityType) {
        if (nationalityType == null) {
            return null;
        }
        if (nationalityType.equalsIgnoreCase("Domestic")) {
            return new Domestic();
        } else if (nationalityType.equalsIgnoreCase("International")) {
            return new International();
        }
        return null;
    }
}

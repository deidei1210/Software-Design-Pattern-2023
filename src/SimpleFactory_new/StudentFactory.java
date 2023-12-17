package SimpleFactory_new;

import State_new.StateGood;

import java.util.Random;

public class StudentFactory {
    //创建并初始化学生
    public Student createStudent(String educationalLevel, String nationality) {
        Random r = new Random();
        StudentIngredientFactory gameIngredientFactory = new StudentIngredientFactory();
        Student student = new Student();
        student.setStudentEducationalLevel(gameIngredientFactory.setEducationalLevel(educationalLevel));
        student.setStudentNationality(gameIngredientFactory.setNationality(nationality));

        //根据国籍随机名字
        String studentName;
        if(nationality.equals("Domestic"))
            studentName = RandomNameGenerator.generateRandomChineseName();
        else
            studentName = RandomNameGenerator.generateRandomEnglishName();
        student.setStudentName(studentName);

//        if (student.getStudentEducationalLevel().getEducationalLevel() == "IG") {
//            student.setReaction(106+(r.nextInt(20)-10));
//            student.setHandspeed(98+(r.nextInt(20)-10));
//            student.setLuck(94+(r.nextInt(20)-10));
//            student.setEndurance(104+(r.nextInt(20)-10));
//            student.setIntelligence(100+(r.nextInt(20)-10));
//        } else if (student.getStudentEducationalLevel().getEducationalLevel() == "EDG") {
//            student.setReaction(103+(r.nextInt(10)-5));
//            student.setHandspeed(99+(r.nextInt(10)-5));
//            student.setLuck(100+(r.nextInt(10)-5));
//            student.setEndurance(101+(r.nextInt(10)-5));
//            student.setIntelligence(95+(r.nextInt(10)-5));
//        } else if (student.getStudentEducationalLevel().getEducationalLevel() == "RNG") {
//            student.setReaction(98+(r.nextInt(14)-7));
//            student.setHandspeed(104+(r.nextInt(14)-7));
//            student.setLuck(99+(r.nextInt(14)-7));
//            student.setEndurance(108+(r.nextInt(14)-7));
//            student.setIntelligence(102+(r.nextInt(14)-7));
//        }
        student.setRank(new int[]{0, 0, 0});
        student.setScore(new double[]{0, 0, 0});
        student.setStudentState(new StateGood());
        return student;
    }
    public class RandomNameGenerator {
        public static void main(String[] args) {
            String randomName = generateRandomEnglishName();
            System.out.println("Random English Name: " + randomName);
        }

        public static String generateRandomEnglishName() {
            String[] lastNames = {
                    "Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
                    "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson"
            };

            String[] firstNames = {
                    "James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph", "Charles", "Thomas",
                    "Christopher", "Daniel", "Matthew", "Anthony", "Mark", "Patricia", "Linda", "Barbara", "Elizabeth", "Jennifer"
            };

            Random random = new Random();

            String randomLastName = lastNames[random.nextInt(lastNames.length)];
            String randomFirstName = firstNames[random.nextInt(firstNames.length)];

            return randomFirstName + " " + randomLastName;
        }
        public static String generateRandomChineseName() {
            String[] familyNames = {
                    "赵", "钱", "孙", "李", "周", "吴", "郑", "王", "冯", "陈",
                    "褚", "卫", "蒋", "沈", "韩", "杨", "朱", "秦", "尤", "许",
                    "何", "吕", "施", "张", "孔", "曹", "严", "华", "金", "魏",
                    "陶", "姜", "戚", "谢", "邹", "喻", "柏", "水", "窦", "章"
            };

            String[] givenNames = {
                    "伟", "芳", "娜", "敏", "静", "强", "磊", "洋", "亮", "明",
                    "艳", "勇", "良", "丽", "玲", "秀", "峰", "杰", "燕", "超",
                    "军", "平", "梅", "新", "萍", "刚", "霞", "冬", "良", "红"
            };

            Random random = new Random();

            String randomFamilyName = familyNames[random.nextInt(familyNames.length)];
            String randomGivenName = givenNames[random.nextInt(givenNames.length)];

            return randomFamilyName + randomGivenName;
        }
    }

}

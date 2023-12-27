package SimpleFactory_new;

import State_new.StateGood;

import java.util.Objects;
import java.util.Random;

public class StudentFactory {
    //创建并初始化学生
    public static Student createStudent(String targetMajor,String educationalLevel) {
        Random r = new Random();
        StudentIngredientFactory studentIngredientFactory = new StudentIngredientFactory();
        //创建一个Student类
        Student student = new Student();
        //设置学生的教育水平
        student.setStudentEducationalLevel(studentIngredientFactory.setEducationalLevel(educationalLevel));
        //设置学生的目标专业
        student.setStudentTargetMajor(studentIngredientFactory.setTargetMajor(targetMajor));

        //随机生成学生的名字
        String studentName;
        studentName = RandomNameGenerator.generateRandomChineseName();
        student.setStudentName(studentName);

        //设置学生的排名
        student.setRank(new int[]{0, 0, 0});
        //设置学生的分数
        student.setScore(new double[]{0, 0, 0});
        //设置学生的状态，初始状态为good
        student.setStudentState(new StateGood());

        //接下来需要设置学生的反应能力、记忆力、运气、忍耐力、智商
        //如果学生是二战考研的话，往往没有一战来的好
        if(Objects.equals(student.getStudentEducationalLevel(), "Graduate")) {
            student.setReaction(106 + (r.nextInt(20) - 10));
            student.setMemoryAbility(98 + (r.nextInt(20) - 10));
            student.setLuck(94 + (r.nextInt(20) - 5));
            student.setEndurance(104 + (r.nextInt(20) - 15));
            student.setIntelligence(100 + (r.nextInt(20) - 10));
        }
        else{
            student.setReaction(106 + (r.nextInt(20) - 5));
            student.setMemoryAbility(98 + (r.nextInt(20) - 5));
            student.setLuck(94 + (r.nextInt(20) - 10));
            student.setEndurance(104 + (r.nextInt(20) - 10));
            student.setIntelligence(100 + (r.nextInt(20) - 5));
        }

        return student;
    }

    //随机姓名生成器
    public static class RandomNameGenerator {
        //测试
        public static void main(String[] args) {
            String randomEnglishName = generateRandomEnglishName();
            String randomChineseName = generateRandomChineseName();
            System.out.println("Random English Name: " + randomEnglishName);
            System.out.println("Random Chinese Name: " + randomChineseName);
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

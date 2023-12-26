package SimpleFactory;

// 创建学生工厂类
class StudentFactory {
    public Student createStudent(String studentType) {
        if ("Undergraduate".equals(studentType)) {
            return new Undergraduate();
        } else if ("Graduate".equals(studentType)) {
            return new Graduate();
        } else if ("PhD".equals(studentType)) {
            return new PhD();
        } else {
            throw new IllegalArgumentException("Invalid student type");
        }
    }
}
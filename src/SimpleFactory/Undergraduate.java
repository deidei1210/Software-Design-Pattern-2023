package SimpleFactory;

// 创建具体的本科生类
class Undergraduate implements Student {
    private String studentName;
    private String studentID;

    @Override
    public void register() {
        System.out.println("Undergraduate student registered");
    }
    // Getter for studentName
    @Override
    public String getStudentName() {
        return studentName;
    }

    // Setter for studentName
    @Override
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    // Getter for studentID
    @Override
    public String getStudentID() {
        return studentID;
    }

    @Override
    // Setter for studentID
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}
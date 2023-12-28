package Iterator;

import Builder.Exam;

import java.util.ArrayList;

public class ExamContainer implements Container {

    //单例模式，使玩家管理器可以被全局访问
    private static final ExamContainer instance = new ExamContainer();
    //建立exam容器
    private final ArrayList<Exam> exams;

    private ExamContainer() {
        exams = new ArrayList<>();
    }

    public static ExamContainer getInstance() {
        return instance;
    }

    //根据指针返回容器对应的对象
    public Exam get(int index) {
        return exams.get(index);
    }

    //在容器末尾增加对象
    public void add(Exam exam) {
        exams.add(exam);
    }

    //返回容器大小
    public int size() {
        return exams.size();
    }

    //返回容器对象
    public ArrayList<Exam> getExams() {
        return exams;
    }

    //生成容器迭代器
    @Override
    public Iterator iterator() {
        return new ExamIterator(this);
    }
}

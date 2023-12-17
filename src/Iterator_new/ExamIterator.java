package Iterator_new;

import Builder_new.Exam;

public class ExamIterator implements Iterator {

    private ExamContainer examsContainer;
    private int index;

    // 将操作对象容器传入
    public ExamIterator(ExamContainer examsContainer) {
        this.examsContainer = examsContainer;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < examsContainer.size();
    }

    @Override
    public Object next() {
        Exam exam = examsContainer.get(index);
        index++;
        return exam;
    }

}

package Observer;

import Iterator.StudentContainer;

public class StudentObserve implements Observer {

    int StudentNum;

    public StudentObserve(int playerNum) {
        StudentNum = playerNum;
    }

    //更新同步数据
    @Override
    public void update(int game, int rank, double score) {
        StudentContainer.getInstance().get(StudentNum).getRank()[game] = rank;
        StudentContainer.getInstance().get(StudentNum).getScore()[game] = score;
    }
}


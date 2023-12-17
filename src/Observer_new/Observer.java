package Observer_new;

/**
 * 观察者
 */
public interface Observer {

    // 当排行榜上学生的排名发生变化时，会把参数值传给观察者
    void update(int game, int rank, double Score);
}

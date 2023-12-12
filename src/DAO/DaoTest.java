package DAO;

public class DaoTest {
    public static void main(String[] args) {//dao模式测试
        PlayerDao playerDao = new PlayerDaoImpl();

        //输出所有的运动员
        for (Player player : playerDao.getAllPlayers()) {
            System.out.println("编号 : "
                    + player.getRollNo() + ", 姓名 : " + player.getName());
        }


        //更新运动员
        Player player = playerDao.getAllPlayers().get(0);
        player.setName("TheShy");
        playerDao.updatePlayer(player);

        //获取运动员
        playerDao.getPlayer(0);
        System.out.println("编号 : "
                + player.getRollNo() + ", 姓名 : " + player.getName());
    }
}

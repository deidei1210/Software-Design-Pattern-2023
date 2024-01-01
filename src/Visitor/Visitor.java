package Visitor;

import java.util.Scanner;

public class Visitor {
    /*
    VisitorShowRank是查询指定学科中，某个学生的排名，依次输入学科，姓名，排名
    VisitorAddRank是把该学科的某个学生的排名添加到一个表中
    */
    RankList rankList = new RankList();

    public void VisitorAddRank(String item, String name, int ranking) {
        rankList.addElement(new RankingList(item, name, ranking));
    }

    public void VisitorShowRank() {
        Scanner scan = new Scanner(System.in);
        String name, item;
        //添加模拟学生排名信息
        RankingList rankingList;
        RankViewingStudent rankViewingStudent = new RankViewingStudent();
        //学生访问排名表
        System.out.println("请依次输入学科名，姓名");
        name = scan.next();
        item = scan.next();
        for (int i = 0; i < rankList.rankingList.size(); i++) {
            rankingList = (RankingList) rankList.rankingList.get(i);
            if (name.equals(rankingList.getName())) {
                if (item.equals(rankingList.getItem())) {
                    rankViewingStudent.view(rankingList);
                    break;
                }
            }
        }
        rankViewingStudent.getCertainItem();
        rankViewingStudent.getCertainName();
        rankViewingStudent.getCertainRanking();
    }
}

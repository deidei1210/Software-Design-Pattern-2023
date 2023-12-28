package Decorator;

import Memento.Memento;

public class Book {
    //书籍类（被装饰者）
    public String studyMaterials = "";       //添加配料的描述

    //获取添加的配料信息
    public String getDescription() {
        return "null";
    }

    //设置备份
    public Memento createMemento() {
        return new Memento(studyMaterials);
    }

    //获取备份
//    public String getFromMemento(@org.jetbrains.annotations.NotNull Memento memento) {
//        return memento.getStudyMaterials();
//    }
}

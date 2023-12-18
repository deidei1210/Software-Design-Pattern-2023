package Memento_new;

public class Memento {
    //备忘录
    private final String studyMaterials;       //配料描述

    public Memento(String studyMaterial) {
        this.studyMaterials = studyMaterial;
    }

    public String getStudyMaterials() {
        return studyMaterials;
    }
}

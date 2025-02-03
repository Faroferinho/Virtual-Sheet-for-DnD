package com.svs.FichaDnD.objects;

public class ClassDnd {
    private String majorClass;
    private String subClass;
    private int level;

    public ClassDnd(String mClass, int sLevel){
        majorClass = mClass;
        level = sLevel;
    }

    public String getMajorClass() {
        return majorClass;
    }

    public void setMajorClass(String majorClass) {
        this.majorClass = majorClass;
    }

    public String getSubClass() {
        return subClass;
    }

    public void setSubClass(String subClass) {
        this.subClass = subClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}

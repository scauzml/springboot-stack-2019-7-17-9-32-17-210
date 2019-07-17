package com.tw.apistackbase.entiey;

import javax.persistence.*;

@Entity
public class Constitutes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String mainElementDesc;
    private String ObjectElementDesc;

    public Constitutes(int id, String mainElementDesc, String objectElementDesc) {
        this.id = id;
        this.mainElementDesc = mainElementDesc;
        ObjectElementDesc = objectElementDesc;
    }

    public Constitutes() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMainElementDesc() {
        return mainElementDesc;
    }

    public void setMainElementDesc(String mainElementDesc) {
        this.mainElementDesc = mainElementDesc;
    }

    public String getObjectElementDesc() {
        return ObjectElementDesc;
    }

    public void setObjectElementDesc(String objectElementDesc) {
        ObjectElementDesc = objectElementDesc;
    }
}

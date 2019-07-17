package com.tw.apistackbase.entiey;

import javax.persistence.*;

@Entity
public class Procuratorate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 50,unique = true,nullable = false)
    private String procuratorateName;

    public Procuratorate(int id, String procuratorateName) {
        this.id = id;
        this.procuratorateName = procuratorateName;
    }

    public Procuratorate() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcuratorateName() {
        return procuratorateName;
    }

    public void setProcuratorateName(String procuratorateName) {
        this.procuratorateName = procuratorateName;
    }
}

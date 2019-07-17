package com.tw.apistackbase.entiey;

import javax.persistence.*;
import java.util.List;

@Entity
public class Procuratorate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length = 50,unique = true,nullable = false)
    private String procuratorateName;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Prosecutors> prosecutors;
    public Procuratorate(int id, String procuratorateName) {
        this.id = id;
        this.procuratorateName = procuratorateName;
    }

    public Procuratorate() {
    }

    public List<Prosecutors> getProsecutors() {
        return prosecutors;
    }

    public void setProsecutors(List<Prosecutors> prosecutors) {
        this.prosecutors = prosecutors;
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

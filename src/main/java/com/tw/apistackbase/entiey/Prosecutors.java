package com.tw.apistackbase.entiey;

import javax.persistence.*;

@Entity
public class Prosecutors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = true)
    private String prosecutorsName;

    public Prosecutors(int id, String prosecutorsName) {
        this.id = id;
        this.prosecutorsName = prosecutorsName;
    }

    public Prosecutors() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProsecutorsName() {
        return prosecutorsName;
    }

    public void setProsecutorsName(String prosecutorsName) {
        this.prosecutorsName = prosecutorsName;
    }
}

package com.tw.apistackbase.entiey;

import javax.persistence.*;

@Entity
public class MainElement extends Element {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String desc;

    public MainElement(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public MainElement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

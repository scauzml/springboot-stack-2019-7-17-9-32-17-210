package com.tw.apistackbase.entiey;

import javax.persistence.*;

@Entity
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String caseName;
    @Column(nullable = false)
    private long happenTime;
    @OneToOne(cascade = CascadeType.ALL)
    private SpecificInformation specificInformation;


    public Case() {
    }

    public Case(int id, String caseName, long happenTime) {

        this.id = id;
        this.caseName = caseName;
        this.happenTime = happenTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public long getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(long happenTime) {
        this.happenTime = happenTime;
    }

    public SpecificInformation getSpecificInformation() {
        return specificInformation;
    }

    public void setSpecificInformation(SpecificInformation specificInformation) {
        this.specificInformation = specificInformation;
    }
}

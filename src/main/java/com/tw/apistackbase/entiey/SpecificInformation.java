package com.tw.apistackbase.entiey;

import org.hibernate.validator.constraints.Currency;

import javax.persistence.*;

@Entity
public class SpecificInformation {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne(cascade = CascadeType.ALL)
    private MainElement mainElement;
    @OneToOne(cascade = CascadeType.ALL)
    private ObjectiveElement objectiveElement;

    public SpecificInformation(int id, MainElement mainElement, ObjectiveElement objectiveElement) {
        this.id = id;
        this.mainElement = mainElement;
        this.objectiveElement = objectiveElement;
    }

    public SpecificInformation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MainElement getMainElement() {
        return mainElement;
    }

    public void setMainElement(MainElement mainElement) {
        this.mainElement = mainElement;
    }

    public ObjectiveElement getObjectiveElement() {
        return objectiveElement;
    }

    public void setObjectiveElement(ObjectiveElement objectiveElement) {
        this.objectiveElement = objectiveElement;
    }
}

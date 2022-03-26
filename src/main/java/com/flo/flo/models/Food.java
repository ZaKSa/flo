package com.flo.flo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;
    private Double cal, mass, bel, jir, ugl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCal() {
        return cal;
    }

    public void setCal(Double cal) {
        this.cal = cal;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Double getBel() {
        return bel;
    }

    public void setBel(Double bel) {
        this.bel = bel;
    }

    public Double getJir() {
        return jir;
    }

    public void setJir(Double jir) {
        this.jir = jir;
    }

    public Double getUgl() {
        return ugl;
    }

    public void setUgl(Double ugl) {
        this.ugl = ugl;
    }
}

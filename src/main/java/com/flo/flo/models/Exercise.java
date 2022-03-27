package com.flo.flo.models;

import javax.persistence.*;

@Entity
@Table(name = "exercise")
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_ex;

    @Column (name = "name_ex")
    private String name_ex;

    @Column (name = "energy_consumption")
    private Double energy_consumption;

    @Column (name = "duration")
    private Integer duration;

    public Integer getId_ex() {
        return id_ex;
    }

    public void setId_ex(Integer id_ex) {
        this.id_ex = id_ex;
    }

    public String getName_ex() {
        return name_ex;
    }

    public void setName_ex(String name_ex) {
        this.name_ex = name_ex;
    }

    public Double getEnergy_consumption() {
        return energy_consumption;
    }

    public void setEnergy_consumption(Double energy_consumption) {
        this.energy_consumption = energy_consumption;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}


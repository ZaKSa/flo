package com.flo.flo.models;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_pr;

    @Column (name = "name_pr")
    private String name_pr;

    @Column (name = "wight_pr")
    private Double wight_pr;

    @Column (name = "caloric_content")
    private Double caloric_content;

    public Integer getId_pr() {
        return id_pr;
    }

    public void setId_pr(Integer id_pr) {
        this.id_pr = id_pr;
    }

    public String getName_pr() {
        return name_pr;
    }

    public void setName_pr(String name_pr) {
        this.name_pr = name_pr;
    }

    public Double getCaloric_content() {
        return caloric_content;
    }

    public void setCaloric_content(Double caloric_content) {
        this.caloric_content = caloric_content;
    }

    public Double getWight_pr() {
        return wight_pr;
    }

    public void setWight_pr(Double wight_pr) {
        this.wight_pr = wight_pr;
    }
}

package com.flo.flo.models;

import javax.persistence.*;

@Entity
@Table(name = "plans_products_ID")
public class Plans_products_ID {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_pl_pr;

    @Column (name = "id_pl")
    private Integer id_pl;

    @Column (name = "id_pr")
    private Integer id_pr;

    public Integer getId_pl() {
        return id_pl;
    }

    public void setId_pl(Integer id_pl) {
        this.id_pl = id_pl;
    }

    public Integer getId_pr() {
        return id_pr;
    }

    public void setId_pr(Integer id_pr) {
        this.id_pr = id_pr;
    }

    public Integer getId_pl_pr() {
        return id_pl_pr;
    }

    public void setId_pl_pr(Integer id_pl_pr) {
        this.id_pl_pr = id_pl_pr;
    }
}

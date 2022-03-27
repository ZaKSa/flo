package com.flo.flo.models;

import javax.persistence.*;

@Entity
@Table(name = "plans_exercises_ID")
public class Plans_exercises_ID {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_pl_ex;

    @Column (name = "id_pl")
    private Integer id_pl;

    @Column (name = "id_ex")
    private Integer id_ex;

    public Integer getId_pl() {
        return id_pl;
    }

    public void setId_pl(Integer id_pl) {
        this.id_pl = id_pl;
    }

    public Integer getId_ex() {
        return id_ex;
    }

    public void setId_ex(Integer id_ex) {
        this.id_ex = id_ex;
    }

    public Integer getId_pl_ex() {
        return id_pl_ex;
    }

    public void setId_pl_ex(Integer id_pl_ex) {
        this.id_pl_ex = id_pl_ex;
    }
}

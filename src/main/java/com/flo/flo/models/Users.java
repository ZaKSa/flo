package com.flo.flo.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_us;

    @Column (name = "name_us")
    private String name_us;

    @Column (name = "surname_us")
    private String surname_us;

    @Column (name = "gender_us")
    private String gender_us;

    @Column (name = "phone_number_us")
    private String phone_number_us;

    @Column (name = "email_us")
    private String email_us;

    @Column (name = "password_us")
    private String password_us;

    @Column (name = "height")
    private Double height;

    @Column (name = "wight")
    private Double wight;

    @Column (name = "bday")
    private Date bday;

    @Column (name = "privilege")
    private Boolean privilege;

    @Column (name = "id_pl")
    private Integer id_pl;

    public Integer getId_us() {
        return id_us;
    }

    public void setId_us(Integer id_us) {
        this.id_us = id_us;
    }

    public String getName_us() {
        return name_us;
    }

    public void setName_us(String name_us) {
        this.name_us = name_us;
    }

    public String getSurname_us() {
        return surname_us;
    }

    public void setSurname_us(String surname_us) {
        this.surname_us = surname_us;
    }

    public String getGender_us() {
        return gender_us;
    }

    public void setGender_us(String gender_us) {
        this.gender_us = gender_us;
    }

    public String getPhone_number_us() {
        return phone_number_us;
    }

    public void setPhone_number_us(String phone_number_us) {
        this.phone_number_us = phone_number_us;
    }

    public String getEmail_us() {
        return email_us;
    }

    public void setEmail_us(String email_us) {
        this.email_us = email_us;
    }

    public String getPassword_us() {
        return password_us;
    }

    public void setPassword_us(String password_us) {
        this.password_us = password_us;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWight() {
        return wight;
    }

    public void setWight(Double wight) {
        this.wight = wight;
    }

    public Date getBday() {
        return bday;
    }

    public void setBday(Date bday) {
        this.bday = bday;
    }

    public Boolean getPrivilege() {
        return privilege;
    }

    public void setPrivilege(Boolean privilege) {
        this.privilege = privilege;
    }

    public Integer getId_pl() {
        return id_pl;
    }

    public void setId_pl(Integer id_pl) {
        this.id_pl = id_pl;
    }
}

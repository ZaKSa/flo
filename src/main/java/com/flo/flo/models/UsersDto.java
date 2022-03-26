package com.flo.flo.models;

import jdk.jshell.Snippet;

public class UsersDto {
    private Integer id_us;
    private String name_us, surname_us, gender_us, phone_number_us, email_us;
    private Double height, wight;

    public static Snippet builder() {
        return null;
    }

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
}
package com.portfolio.personal.model;

import lombok.AccessLevel;
import lombok.Getter;


public class PersonalDetail {

    @Getter(AccessLevel.PUBLIC)
    private String name;

    @Getter(AccessLevel.PUBLIC)
    private String email;

    @Getter(AccessLevel.PUBLIC)
    private int age;

    @Getter(AccessLevel.PUBLIC)
    private String address;

    @Getter(AccessLevel.PUBLIC)
    private String description;

    private Experience experience;

    public PersonalDetail(String name, int age, String email, String address, String description) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.description = description;
    }


    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
}


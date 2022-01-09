package com.portfolio.personal.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class MyEducation {

    @Getter(AccessLevel.PUBLIC)
    private String year;
    @Getter(AccessLevel.PUBLIC)
    private String degree;
    @Getter(AccessLevel.PUBLIC)
    private String university;
    @Getter(AccessLevel.PUBLIC)
    private String description;

    public MyEducation(String year, String degree, String university, String description) {
        this.year = year;
        this.degree = degree;
        this.university = university;
        this.description = description;
    }

}

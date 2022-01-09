package com.portfolio.personal.model;

import lombok.AccessLevel;
import lombok.Getter;

public class MySkills {

    @Getter(AccessLevel.PUBLIC)
    private String skillName;

    @Getter(AccessLevel.PUBLIC)
    private String skillPercentage;

    public MySkills(String skillName, String skillPercentage) {
        this.skillName = skillName;
        this.skillPercentage = skillPercentage;
    }
}

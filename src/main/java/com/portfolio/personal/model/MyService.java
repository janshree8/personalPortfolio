package com.portfolio.personal.model;

import lombok.AccessLevel;
import lombok.Getter;

public class MyService {

    @Getter(AccessLevel.PUBLIC)
    private String title;

    @Getter(AccessLevel.PUBLIC)
    private String description;

    @Getter(AccessLevel.PUBLIC)
    private String icon;

    public MyService(String title, String description, String icon) {
        this.title = title;
        this.description = description;
        this.icon = icon;
    }
}

package com.portfolio.personal.model;

public class Experience {
    private int yearOfExperience;
    private int happyClient;
    private int projectDone;
    private int awards;

    public Experience(int yearOfExperience, int happyClient, int projectDone, int awards) {
        this.yearOfExperience = yearOfExperience;
        this.happyClient = happyClient;
        this.projectDone = projectDone;
        this.awards = awards;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public int getHappyClient() {
        return happyClient;
    }

    public int getProjectDone() {
        return projectDone;
    }

    public int getAwards() {
        return awards;
    }
}

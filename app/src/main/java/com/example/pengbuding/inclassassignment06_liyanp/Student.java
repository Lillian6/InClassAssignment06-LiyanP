package com.example.pengbuding.inclassassignment06_liyanp;

import java.io.Serializable;

/**
 * Created by pengbuding on 01/03/2018.
 */

public class Student implements Serializable {
    private String name;
    private boolean isMale;
    private boolean isFemale;
    private int grades;
    private boolean hasPassed;
    private String otherComments;

    public Student(){}

    public Student(String name, boolean isMale, boolean isFemale, int grades, boolean hasPassed, String otherComments){
        this.name = name;
        this.isMale = isMale;
        this.isFemale = isFemale;
        this.grades= grades;
        this.hasPassed = hasPassed;
        this.otherComments = otherComments;
    }

    public String getName() {
        return name;
    }

    public int getGrades() {
        return grades;
    }

    public String getMoreInformation() {
        return otherComments;
    }

    public boolean getIsMale(){
        return isMale;
    }

    public boolean getIsFemale(){
        return isFemale;
    }

    public boolean getPasses(){
        return hasPassed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public void setHasPassed(boolean hasPassed) {
        this.hasPassed = hasPassed;
    }

    public void setMoreInformation(String otherComments) {
        this.otherComments = otherComments;
    }

    @Override
    public String toString() {
        return "Student's Name: " + name + "\nMale: " + isMale + "\nFemale: " + isFemale
                + "\nGrades: " + grades + "\nHas Passed: " + hasPassed + "\nOther Comments: " + otherComments;
    }
}


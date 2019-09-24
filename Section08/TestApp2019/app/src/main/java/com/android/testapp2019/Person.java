package com.android.testapp2019;

public class Person {
    private String Name;
    private String SurName;

    public Person() {
        Name=null;
        SurName=null;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }
}

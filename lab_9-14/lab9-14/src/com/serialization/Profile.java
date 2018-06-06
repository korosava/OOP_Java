package com.serialization;

import java.io.Serializable;

public class Profile implements Serializable {

        // parameters
    private String name;
    private String surname;
    private String age;


        //getters and setters
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

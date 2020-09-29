package br.com.university.nilone.model;


import java.time.LocalDate;

public class Student {

    private String uid;
    private String name;
    private LocalDate birth;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

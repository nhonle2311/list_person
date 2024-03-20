package org.example.list_personal.model;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate date;
    private String address;
    private String img;

    public Person() {
    }

    public Person(String name, LocalDate date, String adress, String img) {
        this.name = name;
        this.date = date;
        this.address = adress;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAdress(String adress) {
        this.address = adress;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}

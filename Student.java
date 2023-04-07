package com.nishAppZyad;


public class Student extends Person {

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String email, String city, String date, int number) {

        this.name = name;
        this.email = email;
        this.city = city;
        this.date = date;
        this.number = number;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return number;
    }
}

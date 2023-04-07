package com.nishAppZyad;

public class Professor extends Workers {

    public Professor(String name) {
        this.name = name;

    }
    public Professor(String name, String email, String city, String date, int number,int salary) {
        this.name = name;
        this.email = email;
        this.city = city;
        this.date = date;
        this.number = number;
        this.salary=salary;
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
    public int getSalary() {
        return salary;
    }

}

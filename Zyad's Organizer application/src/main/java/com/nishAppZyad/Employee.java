package com.nishAppZyad;

public class Employee extends Workers{
    public Employee(String name) {
        this.name = name;

    }
    public Employee(String name, String email, String city, String date, int number,int salary) {
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


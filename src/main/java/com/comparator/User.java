package com.comparator;

import java.util.Date;

/**
 * Created by user on 09.06.2016.
 */
public class User {
    private String name;
    private String surname;
    private int age;
    private Date birthday;
    private int salary;

    public User(String name, String surname, int age, Date birthday, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.birthday = birthday;
        this.salary = salary;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", salary=" + salary +
                '}';
    }
}

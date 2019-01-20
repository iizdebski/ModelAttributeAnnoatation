package com.izdebski.model;

public class User {

    private String name;
    private Integer age;
    private String email;
    private String country;

    public User(String name, Integer age, String email, String country) {
        super();
        this.name = name;
        this.age = age;
        this.email = email;
        this.country = country;
    }
    public User() {
    }
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getCountry() {
        return country;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
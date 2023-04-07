package com.example.Rest_Api_Part2.HateOas;

import org.springframework.stereotype.Component;

@Component
public class UserModel
{
    private int userId;

    private String password;

    private int age;

    private String name;


    public UserModel()
    {

    }

    public UserModel(int userId, String password, int age, String name)
    {
        this.userId = userId;
        this.password = password;
        this.age = age;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


package com.example.Rest_Api_Part2.Entity;

public class User
{
    private Integer empid;

    private String empName;

    //@Column(name= "email")
    private String empEmail;

    public User()
    {

    }
    public User(String name, String email) {

        this.empName = name;
        this.empEmail = email;
    }

    public User(String name, int i, int i1, String s) {
    }

    public Integer getEmpid() {
        return empid;
    }

    public String getName() {
        return empName;
    }

    public String getEmail() {
        return empEmail;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public void setName(String name) {
        this.empName = name;
    }

    public void setEmail(String email) {
        this.empEmail = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                '}';
    }



}


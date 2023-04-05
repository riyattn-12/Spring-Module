package com.example.SpringrestAPIdemo.entity;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;


@Entity                             //->to map entity with database
@Table(name= "employee_table")     //-->naming table with which it will be mapped
@Valid         //Ques: Apply validation while create a new employee using POST http Request.
public class Employee
{

    @Id    //->primary Key
    @GeneratedValue(strategy = GenerationType.AUTO)  //->system will create/generate primary key
    private Integer empid;
    //@Column(name="name")

    @Size(min=3,max=10,message="Name should be between 3 and 5 characters")
    private String empName;


    //@Column(name= "email")
    private String empEmail;

    public Employee()
    {

    }
    public Employee(String name, String email) {

        this.empName = name;
        this.empEmail = email;
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

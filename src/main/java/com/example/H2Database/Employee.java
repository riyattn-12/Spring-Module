package com.example.H2Database;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    public Long empId;
    @Column
    public String empName;
    @Column
    public String empEmail;
    public Employee()
    {
        super();
    }

    public Employee(Long empId, String empName, String empEmail) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
    }

    public Long getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    @Override
    public String toString() {
        return "employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                '}';
    }
}

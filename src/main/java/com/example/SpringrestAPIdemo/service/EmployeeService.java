package com.example.SpringrestAPIdemo.service;

import com.example.SpringrestAPIdemo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
     List<Employee> findAll();    //->iska implementation EmployeeImpl m

     Employee createEmployee(Employee employee);

     Employee putEmployee(Employee employee);

     List<Employee> findOne();

     Optional<Employee> findOne(int id);

     Employee updateEmployee(Employee employee);
}

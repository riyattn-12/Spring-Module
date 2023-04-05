package com.example.SpringrestAPIdemo.service;
import com.example.SpringrestAPIdemo.entity.Employee;
import com.example.SpringrestAPIdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl  implements EmployeeService
{
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee putEmployee(Employee employee) {
        return null;
    }


    @Override
    public List<Employee> findOne() {
        return null;
    }

    @Override
    public Optional<Employee> findOne(int id)
    {
        return employeeRepository.findById(id);
    }

//    @Override
//    public static Optional<Employee> findOne(int id)
//    {
//        return employeeRepository.findById(id);
//    }
    public Employee updateEmployee(Employee employee)
    {
        return employeeRepository.saveAndFlush(employee);
    }


}

package com.example.SpringrestAPIdemo.Controller;

import com.example.SpringrestAPIdemo.entity.Employee;
import com.example.SpringrestAPIdemo.service.EmployeeService;
import com.example.SpringrestAPIdemo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController                    //->to let spring know that it has Rest methods
public class EmployeeController
{
    @Autowired
    EmployeeService employeeService;   //->with this we can implement jpa methods


    @GetMapping("/employees")
    public List<Employee> findAllEmployee()
    {
        //returns list of all employe
        return employeeService.findAll();

    }

    //Ques: Implement GET http request using path variable top get one employee
    @GetMapping("/employees/{id}")
    public Employee findbyId(@PathVariable int id)
    {
        //return top employee
        Optional<Employee> emp= employeeService.findOne(id);
        if(emp.isPresent()) {
            return emp.get();
        }
        throw new EmployeeNotFoundException("Employee not found for id "+id);

    }

    //Ques: Implement POST http request for Employee to create a new employee.
    @PostMapping("/employees")
    public Employee CreateEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    //Ques: Implement DELETE http request for Employee to delete employee.
    @DeleteMapping("/employees/{id}")
    public Optional<Employee> deleteEmployee(@PathVariable int id)
    {
        Optional<Employee> employee = employeeService.findOne(id);
        if(employee == null)
        {
            throw new EmployeeNotFoundException("id:" +id);

        }
        return employee;

    }

    //Ques: Implement PUT http request for Employee to update employee
    @PutMapping("/employees/{id}")
    public Employee PutEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }


}

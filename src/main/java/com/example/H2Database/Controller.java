package com.example.H2Database;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class Controller
{
    @GetMapping("/employee")
    public List<Employee> retriveAllCourse(){
        return Arrays.asList(
                new Employee(1L,"riya","riya@ttn"),
                new Employee(2L,"shreya","shreyaa@ttn"),
                new Employee((long) 1L,"himani","himani@ttn")



                );
    }



}

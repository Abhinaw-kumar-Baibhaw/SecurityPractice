package com.example.SecurityPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @Autowired
    private EmployeeService service;

    @GetMapping("employee")
    public String getEmployee(){
        return "Hello Employee";
    }

    @GetMapping("OneLogin")
    public String empLogin(){
        return "You are Login";
    }

    @PostMapping("emp")
    public Employee login(@RequestBody Employee employee){
      return service.saveUser(employee);
    }
}

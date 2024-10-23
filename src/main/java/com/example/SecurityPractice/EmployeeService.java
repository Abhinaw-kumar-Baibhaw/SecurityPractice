package com.example.SecurityPractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmpRepo repo;

    public Employee saveUser(Employee employee) {
        return repo.save(employee);
    }
}

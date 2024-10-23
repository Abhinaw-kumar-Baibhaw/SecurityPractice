package com.example.SecurityPractice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Table(name  = "employee")
@Entity
public class Employee {


    @Id
    @Column(name = "emp_id")
    private  int empId;
    @Column(name = "username")
    private String empName;
    @Column(name = "emp_age")
    private int empAge;
    @Column(name = "password")
    private String password;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", password='" + password + '\'' +
                '}';
    }
}

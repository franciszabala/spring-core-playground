package com.franciszabala.example.spring.service;

import com.franciszabala.example.spring.model.Employee;

public class EmployeeService {
 
    private Employee employee;
     
    public Employee getEmployee(){
        return this.employee;
    }
     
    public void setEmployee(Employee e){
        this.employee=e;
    }
}
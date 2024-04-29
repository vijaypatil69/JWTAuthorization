package com.coderzone.jwt.service;

import org.springframework.stereotype.Service;

import com.coderzone.jwt.model.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {

    private List<Employee> empList = new ArrayList<>();

    public EmployeeService() {
        empList.add(new Employee(UUID.randomUUID().toString(), "hrishab", "hrishab@gmail.com"));
        empList.add(new Employee(UUID.randomUUID().toString(), "ritesh", "ritesh@gmail.com"));
    }

    public List<Employee> getEmployeesList() {
        return empList;
    }
}
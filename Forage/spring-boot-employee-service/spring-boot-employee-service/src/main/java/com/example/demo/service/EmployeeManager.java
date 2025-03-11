package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.model.Employees;

public class EmployeeManager {
    private static Employees employees = new Employees();

    static {
        employees.getEmployeeList().add(new Employee(1, "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employees.getEmployeeList().add(new Employee(2, "Jane", "Smith", "jane.smith@example.com", "Project Manager"));
        employees.getEmployeeList().add(new Employee(3, "Alice", "Johnson", "alice.johnson@example.com", "Data Scientist"));
    }

    public static Employees getEmployees() { return employees; }
}

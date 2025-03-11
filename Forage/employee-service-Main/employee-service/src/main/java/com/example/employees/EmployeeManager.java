package com.example.employees;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeManager {
    private final List<Employee> employees = new ArrayList<>();

    public EmployeeManager() {
        employees.add(new Employee("1", "Bruce", "Wayne", "batman@wayne.com", "CEO"));
        employees.add(new Employee("2", "Clark", "Kent", "superman@dailyplanet.com", "Journalist"));
        employees.add(new Employee("3", "Diana", "Prince", "wonderwoman@amazon.com", "Warrior"));
    }

    public List<Employee> getEmployees() { return employees; }
    public void addEmployee(Employee employee) { employees.add(employee); }
}

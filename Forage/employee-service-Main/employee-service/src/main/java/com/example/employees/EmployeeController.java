package com.example.employees;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeManager.getEmployees();
    }

    @PostMapping
    public void addEmployee(@RequestBody Employee employee) {
        employeeManager.addEmployee(employee);
    }
}

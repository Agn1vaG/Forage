package com.example.demo.controller;

import com.example.demo.model.Employees;
import com.example.demo.service.EmployeeManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    public Employees getAllEmployees() {
        return EmployeeManager.getEmployees();
    }
}

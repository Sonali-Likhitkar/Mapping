package com.example.controller;

import com.example.model.EmployeeEntity;
import com.example.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Employee")
public class Employee {

    private EmployeeService employeeService;

    public Employee(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping("/saveEmployee")
    public EmployeeEntity create(@RequestBody EmployeeEntity employeeEntity) {
        return employeeService.saveEmployee(employeeEntity);
    }


    @PutMapping("/UpdateEmployee/{empId}")
    public EmployeeEntity update(@PathVariable Long empId, @RequestBody EmployeeEntity employeeEntity) {
        return employeeService.updateEmployee(employeeEntity);
    }


    @GetMapping("/getAll")
    public List<EmployeeEntity> getAll() {
        return employeeService.getAllEmp();
    }

}

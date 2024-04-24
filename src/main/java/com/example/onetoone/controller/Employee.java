package com.example.onetoone.controller;

import com.example.onetoone.model.EmployeeEntity;
import com.example.onetoone.service.EmployeeService;
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


    @PutMapping("/UpdateEmployee/{id}")
    public EmployeeEntity update(@PathVariable Long id, @RequestBody EmployeeEntity employeeEntity) {
        return employeeService.updateEmployee(id, employeeEntity);
    }


    @GetMapping("/getAll")
    public List<EmployeeEntity> getAll() {
        return employeeService.getAllEmp();
    }

}

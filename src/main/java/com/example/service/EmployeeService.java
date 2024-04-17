package com.example.service;

import com.example.model.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);

    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
    
    List<EmployeeEntity> getAllEmp();

//    EmployeeEntity getByName(String employeeName);
}

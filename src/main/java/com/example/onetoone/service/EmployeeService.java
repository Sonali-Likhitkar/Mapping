package com.example.onetoone.service;

import com.example.onetoone.model.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);

    EmployeeEntity updateEmployee(Long id,EmployeeEntity employeeEntity);

    List<EmployeeEntity> getAllEmp();

}

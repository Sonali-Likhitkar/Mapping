package com.example.serviceImpl;

import com.example.model.EmployeeEntity;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this. employeeRepository= employeeRepository;
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {

        EmployeeEntity employee = new EmployeeEntity();

     employee.setEmpId(employeeEntity.getEmpId());
     employee.setEmployeeName(employeeEntity.getEmployeeName());
     employee.setDepartment(employeeEntity.getDepartment());
     employee.setProject(employeeEntity.getProject());

        return employeeRepository.save(employee);
    }

    @Override
    public List<EmployeeEntity> getAllEmp() {
        return  employeeRepository.findAll();
    }

//    @Override
//    public EmployeeEntity getByName(String employeeName) {
//        return employeeRepository.getByName(employeeName);
//    }
}

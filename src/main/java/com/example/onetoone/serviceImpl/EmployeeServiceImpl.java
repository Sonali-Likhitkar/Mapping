package com.example.onetoone.serviceImpl;

import com.example.constatnts.ConstantsFile;
import com.example.exception.Exception;
import com.example.onetoone.controller.Employee;
import com.example.onetoone.model.DepartmentEntity;
import com.example.onetoone.model.EmployeeEntity;
import com.example.onetoone.repository.EmployeeRepository;
import com.example.onetoone.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        if(employeeEntity.getEmployeeName().isEmpty()||employeeEntity.getDepartment().getDepartmentName().isEmpty()||employeeEntity.getProject().getProjectName().isEmpty()){
            throw new Exception(HttpStatus.BAD_REQUEST, ConstantsFile.EMPTY_DATA);
        } else {
            return employeeRepository.save(employeeEntity);
        }
    }

    @Override
    public EmployeeEntity updateEmployee(Long id ,EmployeeEntity employeeEntity) {
//       try{
           EmployeeEntity  existingEmployee= employeeRepository.findById(id).orElse(null);
           if(existingEmployee==null){
               throw  new Exception(HttpStatus.BAD_REQUEST,ConstantsFile.NOT_FOUND);
           }
           // Update the fields of the existing employee with the new values
           existingEmployee.setEmployeeName(employeeEntity.getEmployeeName());
           existingEmployee.setDepartment(employeeEntity.getDepartment());
           existingEmployee.setProject(employeeEntity.getProject());

        return employeeRepository.save(existingEmployee);
//    } catch (Exception e){
////           return HttpStatus.INTERNAL_SERVER_ERROR;
//
//       }
       }

    @Override
    public List<EmployeeEntity> getAllEmp() {
        return employeeRepository.findAll();
    }

}

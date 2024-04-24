package com.example.onetone;

import com.example.onetoone.model.DepartmentEntity;
import com.example.onetoone.model.EmployeeEntity;
import com.example.onetoone.model.ProjectEntity;
import com.example.onetoone.repository.EmployeeRepository;
import com.example.onetoone.serviceImpl.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import static org.mockito.Mockito.verify;

@SpringBootTest
public class EmployeeServiceImplTest {

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    @Mock
    private EmployeeRepository employeeRepository;


    @Test
    public void saveEmployee() {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        DepartmentEntity department = new DepartmentEntity();
        department.setDepartmentId(1);
        department.setDepartmentName("IT");
        ProjectEntity project = new ProjectEntity();
        project.setProjectId(2);
        project.setProjectName("WMS");
        employeeEntity.setEmpId(1L);
        employeeEntity.setEmployeeName("sonali");
        employeeEntity.setDepartment(department);
        employeeEntity.setProject(project);
        Mockito.when(employeeRepository.save(Mockito.any())).thenReturn(employeeEntity);
        employeeService.saveEmployee(employeeEntity);
        verify(employeeRepository).save(employeeEntity);
    }

//    public void updateEmployee(){
//        EmployeeEntity employee = new EmployeeEntity();
//
//        employeeService.updateEmployee(employee);
//    }
}

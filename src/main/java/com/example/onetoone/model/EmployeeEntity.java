package com.example.onetoone.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "EmployeeEntity")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String employeeName;

    @OneToOne(cascade = CascadeType.ALL)
    private DepartmentEntity department;

    @OneToOne(cascade = CascadeType.ALL)
    private ProjectEntity project;


}

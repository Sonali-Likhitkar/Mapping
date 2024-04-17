package com.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "ProjectEntity")
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProjectEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int projecctId;
    private String  projectName;

//    @OneToOne(mappedBy = "ProjectEntity")
//    private EmployeeEntity employee;
}

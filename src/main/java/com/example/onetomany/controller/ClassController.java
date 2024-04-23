package com.example.onetomany.controller;

import com.example.onetomany.model.Teacher;
import com.example.onetomany.sevice.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//  Through the single Direction Mapping
@RestController
public class ClassController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/createTeacher")
    public Teacher createTeacher(@RequestBody Teacher teacher){
        return  teacherService.createTeacher(teacher);
    }

    @GetMapping("/getTeachers")
    public List<Teacher> getTeachers (){
        return  teacherService.fetchAllTeacherList();
    }

    @GetMapping("/getById/{teacherId}")
    public ResponseEntity<Teacher> getById(@PathVariable long teacherId){
       Teacher teacher=  teacherService.getById(teacherId);
         return new  ResponseEntity<>(teacher , HttpStatus.OK);
    }
}

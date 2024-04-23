package com.example.onetomany.sevice;

import com.example.onetomany.model.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher createTeacher(Teacher teacher);

    List<Teacher> fetchAllTeacherList();

    public Teacher getById(long teacherId);
}

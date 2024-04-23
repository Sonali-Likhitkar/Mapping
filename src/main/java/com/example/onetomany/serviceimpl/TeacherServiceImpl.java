package com.example.onetomany.serviceimpl;

import com.example.onetomany.model.Teacher;
import com.example.onetomany.repository.TeacherRepo;
import com.example.onetomany.sevice.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepo teacherRepo;
    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    @Override
    public List<Teacher> fetchAllTeacherList() {
        return teacherRepo.findAll();
    }

    @Override
    public Teacher getById(long teacherId) {
        Teacher teacher = teacherRepo.findById(teacherId).get();
        return null;
    }
}

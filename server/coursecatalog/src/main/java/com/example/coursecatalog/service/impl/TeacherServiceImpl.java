package com.example.coursecatalog.service.impl;

import com.example.coursecatalog.domain.model.Teacher;
import com.example.coursecatalog.domain.repository.TeacherRepository;
import com.example.coursecatalog.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getTeachers() {
        return teacherRepository.findAll();
    }
}

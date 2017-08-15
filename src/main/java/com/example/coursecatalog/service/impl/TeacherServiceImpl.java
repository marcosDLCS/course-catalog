package com.example.coursecatalog.service.impl;

import com.example.coursecatalog.domain.model.Teacher;
import com.example.coursecatalog.domain.repository.TeacherMapper;
import com.example.coursecatalog.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {

    private final TeacherMapper teacherMapper;

    public TeacherServiceImpl(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    @Override
    public List<Teacher> getTeachers() {
        return teacherMapper.findAll();
    }
}

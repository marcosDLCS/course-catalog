package com.example.coursecatalog.domain.repository.impl;

import com.example.coursecatalog.domain.mapper.TeacherMapper;
import com.example.coursecatalog.domain.model.Teacher;
import com.example.coursecatalog.domain.repository.TeacherRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("teacherRepository")
public class TeacherRepositoryImpl implements TeacherRepository {

    private final TeacherMapper teacherMapper;

    public TeacherRepositoryImpl(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    @Override
    public List<Teacher> findAll() {
        return teacherMapper.findAll();
    }

    @Override
    public Teacher findById(Long id) {
        return teacherMapper.findById(id);
    }
}

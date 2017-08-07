package com.example.coursecatalog.domain.repository;

import com.example.coursecatalog.domain.model.Course;
import com.example.coursecatalog.domain.model.Teacher;

import java.util.List;

public interface TeacherRepository {

    List<Teacher> findAll();

    Teacher findById(Long id);
}

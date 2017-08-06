package com.example.coursecatalog.domain.repository;

import com.example.coursecatalog.domain.model.Course;

import java.util.List;

public interface CourseRepository {

    List<Course> findAll();

    Course findById(Long id);

}

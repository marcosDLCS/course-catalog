package com.example.coursecatalog.domain.repository.impl;

import com.example.coursecatalog.domain.mapper.CourseMapper;
import com.example.coursecatalog.domain.model.Course;
import com.example.coursecatalog.domain.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("courseRepository")
public class CourseRepositoryImpl implements CourseRepository {

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseMapper.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseMapper.findById(id);
    }

    @Override
    public void saveCourse(Course course) {
        courseMapper.saveCourse(course);
    }
}

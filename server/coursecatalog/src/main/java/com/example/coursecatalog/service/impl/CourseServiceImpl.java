package com.example.coursecatalog.service.impl;

import com.example.coursecatalog.domain.model.Course;
import com.example.coursecatalog.domain.repository.CourseRepository;
import com.example.coursecatalog.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }
}

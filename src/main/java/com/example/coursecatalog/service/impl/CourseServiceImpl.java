package com.example.coursecatalog.service.impl;

import com.example.coursecatalog.domain.model.Course;
import com.example.coursecatalog.domain.repository.CourseMapper;
import com.example.coursecatalog.service.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("courseService")
public class CourseServiceImpl implements CourseService{

    private final CourseMapper courseMapper;

    public CourseServiceImpl(CourseMapper courseMapper) {
        this.courseMapper = courseMapper;
    }

    @Override
    public List<Course> getCourses(final String order) {
        return courseMapper.findAll(order != null ? order : "asc");
    }

    @Override
    public void postCourse(final Course course) {
         courseMapper.saveCourse(course);

    }
}

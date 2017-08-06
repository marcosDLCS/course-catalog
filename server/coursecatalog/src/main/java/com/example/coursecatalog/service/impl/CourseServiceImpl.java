package com.example.coursecatalog.service.impl;

import com.example.coursecatalog.domain.model.Course;
import com.example.coursecatalog.domain.repository.CourseRepository;
import com.example.coursecatalog.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service("courseService")
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;

    @Autowired
    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getCourses(final String order) {
        final List<Course> courses = courseRepository.findAll();
        return courses.isEmpty() ? Collections.emptyList() : returnOrderedList(courses, order);
    }

    @Override
    public void postCourse(final Course course) {
        courseRepository.saveCourse(course);
    }

    private List<Course> returnOrderedList(final List<Course> list, final String order){
        if(order != null && (order.equalsIgnoreCase("asc") || order.equalsIgnoreCase("desc"))){
            final List<Course> orderedList = list.stream()
                    .sorted(Comparator.comparing(Course::getName)).collect(Collectors.toList());
            if (order.equalsIgnoreCase("desc")) Collections.reverse(orderedList);
            return orderedList;
        }
        return list;
    }
}

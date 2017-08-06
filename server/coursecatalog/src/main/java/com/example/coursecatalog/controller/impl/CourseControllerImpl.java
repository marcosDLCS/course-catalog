package com.example.coursecatalog.controller.impl;

import com.example.coursecatalog.controller.CourseController;
import com.example.coursecatalog.domain.Course;
import com.example.coursecatalog.service.CourseService;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;

@Component
@Path("/courses")
public class CourseControllerImpl implements CourseController{

    private final CourseService courseService;

    public CourseControllerImpl(CourseService courseService) {
        this.courseService = courseService;
    }

    @GET
    @Produces("application/json")
    public List<Course> getCourses(){
        return (List<Course>) Response.ok(courseService.getCourses()).build();
    }
}

package com.example.coursecatalog.controller;

import com.example.coursecatalog.domain.model.Course;
import com.example.coursecatalog.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Component
@Path("/courses")
public class CourseController{

    @Autowired
    private CourseService courseService;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> getCourses(){
        List<Course> courses = courseService.getCourses();
        return (List<Course>) Response.ok().build();
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTest(){
        return "This is a successful test!";
    }
}

package com.example.coursecatalog.controller;

import com.example.coursecatalog.domain.model.Course;
import com.example.coursecatalog.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/courses")
public class CourseController{

    @Autowired
    private CourseService courseService;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> getCourses(@QueryParam("order") String order){
        List<Course> courses = courseService.getCourses(order);
        return courses;
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTest(){
        return "This is a successful test!";
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<Course> postCourse(){
        List<Course> courses = courseService.postCourse();
        return courses;
    }
}

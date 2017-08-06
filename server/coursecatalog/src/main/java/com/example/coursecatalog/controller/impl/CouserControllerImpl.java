package com.example.coursecatalog.controller.impl;

import com.example.coursecatalog.controller.CourseController;
import com.example.coursecatalog.domain.Course;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;

@Component
@Path("/courses")
public class CouserControllerImpl implements CourseController{

    @GET
    @Produces("application/json")
    public List<Course> getCourses(){
        return null;
    }
}

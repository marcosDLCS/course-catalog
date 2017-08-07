package com.example.coursecatalog.controller;

import com.example.coursecatalog.domain.model.Teacher;
import com.example.coursecatalog.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Component
@Path("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Teacher> getTeachers() {
        List<Teacher> teachers = teacherService.getTeachers();
        return teachers;
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTest() {
        return "This is a successful test! - [Teacher]";
    }

}

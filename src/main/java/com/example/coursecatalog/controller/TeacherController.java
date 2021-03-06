package com.example.coursecatalog.controller;

import com.example.coursecatalog.service.TeacherService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Path("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTeachers() {
        return Response.ok().entity(teacherService.getTeachers())
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET")
                .allow("OPTIONS").build();
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTest() {
        return "This is a successful test! - [Teacher]";
    }

}

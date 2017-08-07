package com.example.coursecatalog.controller;

import com.example.coursecatalog.domain.model.Course;
import com.example.coursecatalog.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Component
@Path("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCourses(@QueryParam("order") String order) {
        return Response.ok().entity(courseService.getCourses(order))
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
                .allow("OPTIONS").build();
    }

    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String getTest() {
        return "This is a successful test! - [Course]";
    }

    @POST
    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response postCourse(final Course course) {
        courseService.postCourse(course);
        return Response.status(201).entity("Course saved").build();
    }
}

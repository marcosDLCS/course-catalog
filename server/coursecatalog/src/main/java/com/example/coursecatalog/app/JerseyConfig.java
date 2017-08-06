package com.example.coursecatalog.app;

import com.example.coursecatalog.controller.CourseController;
import com.example.coursecatalog.controller.impl.CourseControllerImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/course-api")
public class JerseyConfig extends ResourceConfig{
    public JerseyConfig() {
        register(CourseControllerImpl.class);
    }
}

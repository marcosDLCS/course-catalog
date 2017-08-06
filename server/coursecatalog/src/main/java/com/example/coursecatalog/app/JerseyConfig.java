package com.example.coursecatalog.app;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/course-api")
public class JerseyConfig extends ResourceConfig{


}

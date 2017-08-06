package com.example.coursecatalog.app;

import com.example.coursecatalog.domain.mapper.CourseMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.example.coursecatalog.domain.mapper")
public class CourseCatalogApplication {

	private final CourseMapper courseMapper;

	public CourseCatalogApplication(CourseMapper courseMapper) {
		this.courseMapper = courseMapper;
	}

	public static void main(String[] args) {
		SpringApplication.run(CourseCatalogApplication.class, args);
	}
}

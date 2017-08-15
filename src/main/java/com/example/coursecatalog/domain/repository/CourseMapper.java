package com.example.coursecatalog.domain.repository;

import com.example.coursecatalog.domain.model.Course;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("courseMapper")
@Mapper
public interface CourseMapper {

    List<Course> findAll(@Param ("order") String order);

    void saveCourse(Course course);
}

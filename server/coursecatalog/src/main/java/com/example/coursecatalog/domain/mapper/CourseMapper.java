package com.example.coursecatalog.domain.mapper;

import com.example.coursecatalog.domain.model.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CourseMapper {

    @Select("SELECT * FROM COURSE")
    List<Course> findAll();

    @Select("SELECT * FROM COURSE WHERE id = #{id}")
    Course findById(@Param("id") Long id);

    @Select("SELECT * FROM COURSE WHERE name = #{name}")
    Course findByName(@Param("name") String name);

}

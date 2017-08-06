package com.example.coursecatalog.domain.mapper;

import com.example.coursecatalog.domain.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CourseMapper {

    @Select("SELECT * FROM COURSE WHERE name = #{name}")
    Course findByState(@Param("name") String name);
}

package com.example.coursecatalog.domain.mapper;

import com.example.coursecatalog.domain.model.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CourseMapper {

    @Select("SELECT C.id as id, C.active as active, C.name as name, C.level as level, C.hours as hours, C.teacher as teacher, CONCAT_WS(' ', T.name, T.surname) as teacherName FROM COURSE C, TEACHER T WHERE C.active = true AND C.teacher = T.id")
    List<Course> findAll();

    @Select("SELECT * FROM COURSE WHERE id = #{id} AND active = true")
    Course findById(@Param("id") Long id);

    @Select("SELECT * FROM COURSE WHERE name = #{name} AND active = true")
    Course findByName(@Param("name") String name);

    @Insert("INSERT INTO COURSE (name, teacher, hours, level, active) VALUES (#{name}, #{teacher}, #{hours}, #{level}, #{active})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void saveCourse(Course course);

}

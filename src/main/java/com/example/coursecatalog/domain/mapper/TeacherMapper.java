package com.example.coursecatalog.domain.mapper;

import com.example.coursecatalog.domain.model.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface TeacherMapper {

    @Select("SELECT * FROM TEACHER")
    List<Teacher> findAll();

    @Select("SELECT * FROM TEACHER WHERE id = #{id}")
    Teacher findById(@Param("id") Long id);
}

package com.example.coursecatalog.domain.repository;

import com.example.coursecatalog.domain.model.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("teacherMapper")
@Mapper
public interface TeacherMapper {

    List<Teacher> findAll();
}

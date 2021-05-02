package com.bjpowernode.Dao;

import com.bjpowernode.domain.Students;

import java.util.List;
import java.util.Map;

public interface StudentsDao {
    List<Students> selectStudents();
    Students selectById(Students student);
    List<Map<String,Object>> selectDouble();
}

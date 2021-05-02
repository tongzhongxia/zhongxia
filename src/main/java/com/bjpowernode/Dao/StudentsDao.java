package com.bjpowernode.Dao;

import com.bjpowernode.domain.Students;

import java.util.List;

public interface StudentsDao {
    List<Students> selectStudents();
    Students selectById(Students student);
}

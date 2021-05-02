package com.bjpowernode.Dao;

import com.bjpowernode.domain.Students;
import com.bjpowernode.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentsDao_text implements StudentsDao{
    @Override
    public List<Students> selectStudents() {
        //在实现类中调用sqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sqlId = "selectStudents";

        List<Students> list = sqlSession.selectList(sqlId);
        return list;
    }

    @Override
    public Students selectById(Students student) {
        Students students = null;
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sqlId = "selectById";
        List<Students> list = sqlSession.selectList(sqlId,student);
        if (list.size()==1) students= list.get(0);
    return students;
    }
}

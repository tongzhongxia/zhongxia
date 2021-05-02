package com.bjpowernode;

import com.bjpowernode.Dao.StudentsDao_text;
import com.bjpowernode.domain.Students;
import com.bjpowernode.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestStudentDao_Mybatis {
    @Test
    public void TestSelectStudents(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sqlId = "selectStudents";
        List<Students> list = sqlSession.selectList(sqlId);
        for (Students stu:list){
            System.out.println(stu);
        }
    }
    @Test
    public void TestDao(){
        StudentsDao_text studentsDao_text = new StudentsDao_text();
        List<Students> list=studentsDao_text.selectStudents();
        for (Students stu:list){
            System.out.println(stu);
        }
    }
    @Test
    public void TestSelectById(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        String sqlId = "selectById";
        Students student = new Students(3,"wangwu","333@qq.com",30);
        List<Students> list = sqlSession.selectList(sqlId,student);
        for (Students stu:list){
            System.out.println(stu);
        }
    }
    @Test
    public void TestDao_SelectById(){
        StudentsDao_text studentsDao_text = new StudentsDao_text();
        Students student = new Students(3,"wangwu","333@qq.com",30);
        Students selectedStudent = studentsDao_text.selectById(student);
        System.out.println(selectedStudent);
    }


}

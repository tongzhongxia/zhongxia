package com.bjpowernode;

import com.bjpowernode.domain.Students;
import com.bjpowernode.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestStudentDao_Mybatis {
    @Test
    public void TestSelectDouble(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        sqlSession.getMapper(SudentsDao.class);
    }
}

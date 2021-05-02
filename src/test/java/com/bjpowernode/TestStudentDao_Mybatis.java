package com.bjpowernode;
import com.bjpowernode.Dao.StudentsDao;
import com.bjpowernode.domain.Students;
import com.bjpowernode.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestStudentDao_Mybatis {
    @Test
    public void TestSelectDouble(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentsDao dao = sqlSession.getMapper(StudentsDao.class);
        List<Map<String,Object>> list= dao.selectDouble();
        for (Map map:list){
            Set<String> keySet = map.keySet();
            for (String key:keySet){
                Object value = map.get(key);
                System.out.println(key+"="+value);
            }


        }
    }
}

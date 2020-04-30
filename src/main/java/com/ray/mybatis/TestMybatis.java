package com.ray.mybatis;

import com.ray.mybatis.mapper.CarMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {
  public static void main(String[] args) {
    String resourcesPath = "config-mybatis.xml";
    InputStream resource = null;
    SqlSession sqlSession = null;
    try {
      resource = Resources.getResourceAsStream(resourcesPath);
      SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resource);
      sqlSession = build.openSession();
      //创建mapper
      CarMapper carMapper = sqlSession.getMapper(CarMapper.class);
      String carName = carMapper.selectCarName(1);
      System.out.println(carName);
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      if(sqlSession != null){
        sqlSession.close();
      }
    }
  }
}

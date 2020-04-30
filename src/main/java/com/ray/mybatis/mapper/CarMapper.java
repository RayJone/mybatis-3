package com.ray.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;

public interface CarMapper {
  String selectCarName(int id);
}

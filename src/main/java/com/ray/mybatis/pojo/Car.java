package com.ray.mybatis.pojo;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("car")
public class Car implements Serializable {
    private Integer id;
    private String Name;

  public Car(Integer id, String name) {
    this.id = id;
    Name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }
}

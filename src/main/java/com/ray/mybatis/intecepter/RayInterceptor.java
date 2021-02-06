package com.ray.mybatis.intecepter;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;

import java.util.Properties;

/**
 * @author ray_jone@163.com
 * @date 2021/1/29 23:38
 */
public class RayInterceptor implements Interceptor {

  @Override
  public Object intercept(Invocation invocation) throws Throwable {
    return null;
  }

  @Override
  public Object plugin(Object target) {
    return null;
  }

  @Override
  public void setProperties(Properties properties) {

  }
}

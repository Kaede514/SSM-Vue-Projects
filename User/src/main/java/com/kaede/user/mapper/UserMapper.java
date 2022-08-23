package com.kaede.user.mapper;

import com.kaede.user.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author kaede
 * @create 2022-08-20 12:25
 */

public interface UserMapper {

    //查询所有用户信息
    List<User> selectAll();

    //根据id查询单个用户信息
    User selectById(@Param("id") Integer id);

    //添加用户
    void insert(User user);

    //修改用户信息
    void update(User user);

    //根据id删除用户
    void delete(@Param("id") Integer id);

}

package com.kaede.user.service;

import com.kaede.user.pojo.User;

import java.util.List;

/**
 * @author kaede
 * @create 2022-08-20 12:20
 */

public interface UserService {

    //查询所有用户信息
    List<User> selectAll();

    //根据id查询单个用户信息
    User selectById(Integer id);

    //添加用户
    void insert(User user);

    //修改用户信息
    void update(User user);

    //根据id删除用户
    void delete(Integer id);

}

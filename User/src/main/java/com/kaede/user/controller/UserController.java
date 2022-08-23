package com.kaede.user.controller;

import com.kaede.user.pojo.User;
import com.kaede.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.tools.jconsole.JConsole;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kaede
 * @create 2022-08-20 12:20
 *
 * 查询所有用户信息  -->  /users -->  GET
 * 添加用户  -->  /users  -->  POST
 * 根据id删除用户  -->  /users/{id}  -->  DELETE
 * 根据id查询单个用户信息  -->  /users/{id}  -->  GET
 * 修改用户信息  -->  /users  -->  PUT
 */

@RestController
//解决跨域问题
@CrossOrigin
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    //在url中传输的数据可以自动转型，如page，rows
    private Map<String,Object> selectAll(Integer page, Integer rows) {
        Map<String,Object> map = new HashMap<>();
        List<User> users = userService.selectAll();
        map.put("total", 10);
        map.put("totalPage", 1);
        map.put("page", page);
        map.put("users", users);
        return map;
    }

    @PostMapping()
    //axios发送的数据是json格式，使用@RequestBody注解将json格式的请求参数转换为java对象
    private Map<String,Object> insert(@RequestBody User user) {
        Map<String,Object> map = new HashMap<>();
        userService.insert(user);
        map.put("success", true);
        map.put("msg", "添加用户成功");
        return map;
    }

    @DeleteMapping("/{id}")
    private Map<String,Object> delete(@PathVariable("id") Integer id) {
        Map<String,Object> map = new HashMap<>();
        userService.delete(id);
        map.put("success", true);
        map.put("msg", "删除用户成功");
        return map;
    }

    @GetMapping("/{id}")
    private User selectById(@PathVariable("id") Integer id) {
        return userService.selectById(id);
    }

    @PutMapping()
    public Map<String,Object> update(@RequestBody User user) {
        Map<String,Object> map = new HashMap<>();
        userService.update(user);
        map.put("success", true);
        map.put("msg", "修改用户信息成功");
        return map;
    }

}

package com.example.web;

import com.example.config.CException;
import com.example.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * restful api
 * Created by zhezhiyong@163.com on 2016/10/12.
 */
@RestController
@RequestMapping("/user")
@Api(value = "用户服务", description = "提供RESTful风格API的用户的增删改查服务")
public class UserController {
    //模拟DAO层
    private final Map<Long, User> repository = new HashMap<>();

    @PostMapping
    @ApiOperation("添加用户")
    public Boolean add(@RequestBody User user) throws Exception {
        repository.put(user.getId(), user);
        if (user != null) throw new CException("hello");
        getException();
        return true;
    }

    private void getException() throws Exception {
        throw new Exception("haha");
    }

    @DeleteMapping("/{id}")
    @ApiOperation("通过ID删除用户")
    public Boolean delete(@PathVariable Long id) {
        repository.remove(id);
        return true;
    }

    @PutMapping
    @ApiOperation("更新用户")
    public Boolean update(@RequestBody User user) {
        repository.put(user.getId(), user);
        return true;
    }

    @GetMapping("/{id}")
    @ApiOperation("通过ID查询用户")
    public User findById(@PathVariable Long id) {
        return repository.get(id);
    }
}

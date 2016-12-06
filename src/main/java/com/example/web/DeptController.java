package com.example.web;

import com.example.dao.DeptDao;
import com.example.domain.Dept;
import com.example.service.impl.DeptService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>部门api</p>
 * Created by zhezhiyong@163.com on 2016/11/11.
 */
@RestController
@RequestMapping("/dept")
@Api(value = "部门服务", description = "提供RESTful风格API的部门的增删改查服务")
public class DeptController {
    @Resource
    private DeptService deptService;
    @Resource
    private DeptDao deptDao;

    @PostMapping
    @ApiOperation("添加部门")
    private boolean add(@RequestBody Dept dept) {
        deptDao.save(dept);
        return true;
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除部门")
    private boolean delete(@PathVariable Long id) {
        deptDao.delete(id);
        return true;
    }

    @PutMapping
    @ApiOperation("更新部门")
    private boolean put(@RequestBody Dept dept) {
        deptDao.save(dept);
        return true;
    }

    @GetMapping("/{id}")
    @ApiOperation("查询部门")
    private Dept findById(@PathVariable Long id) {
        return deptService.findByid(id);
    }
}

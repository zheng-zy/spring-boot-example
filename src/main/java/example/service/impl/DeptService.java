package example.service.impl;

import example.dao.DeptDao;
import example.domain.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/11/11.
 */
@Service
public class DeptService {

    @Resource
    private DeptDao deptDao;

    public Dept findByid(Long id) {
        return deptDao.findById(id);
    }

}
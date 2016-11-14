package example.service.impl;

import example.domain.primary.Dept;
import example.repository.primary.DeptRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/11/11.
 */
@Service
public class DeptService {

    @Resource
    private DeptRepository deptRepository;

    public Dept findByid(Long id) {
        return deptRepository.findById(id);
    }

}
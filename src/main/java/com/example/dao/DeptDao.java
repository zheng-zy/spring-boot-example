package com.example.dao;

import com.example.domain.Dept;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/11/11.
 */
@Transactional
public interface DeptDao extends PagingAndSortingRepository<Dept, Long> {
    Dept findById(Long id);
}
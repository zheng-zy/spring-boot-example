package com.example.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>用户类</p>
 * Created by zhezhiyong@163.com on 2016/11/11.
 */
@Entity
@Table(name = "tbl_dept")
public class Dept implements Serializable {
    private static final long serialVersionUID = -5451740152235826540L;
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @Column(length = 20)
    private String name;
    @NotNull
    @Column
    private Date createTime;

    public Dept() {

    }

    public Dept(String name, Date createTime) {
        this.name = name;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

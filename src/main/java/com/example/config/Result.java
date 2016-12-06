package com.example.config;

import lombok.Data;

/**
 * <p>应答</p>
 * Created by zhezhiyong@163.com on 2016/12/6.
 */
@Data
public class Result {

    private int code;
    private String msg;
    private Object data;

    public Result() {
        this.code = 200;
        this.msg = "ok";
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }


}

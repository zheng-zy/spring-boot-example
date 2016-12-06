package com.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>异常处理</p>
 * Created by zhezhiyong@163.com on 2016/12/6.
 */
@ControllerAdvice(basePackages = {"com.example"})
public class RestControllerAdvice {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex) {
        HttpStatus status = getStatus(request);
        logger.error(ex.getMessage(), ex);
        return new ResponseEntity<>(new Result(status.value(), ex.getMessage()), HttpStatus.OK);
    }

    @ExceptionHandler(CException.class)
    @ResponseBody
    public ResponseEntity<?> handleControllerException(HttpServletRequest request, CException ex) {
        HttpStatus status = getStatus(request);
        logger.error(ex.getMessage(), ex);
        return new ResponseEntity<>(new Result(status.value(), ex.getMessage()), HttpStatus.OK);
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }

}

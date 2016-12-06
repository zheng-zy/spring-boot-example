package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 获取配置文件属性
 * Created by zhezhiyong@163.com on 2016/11/11.
 */
@ConfigurationProperties(
        locations = "constants.yaml",
        prefix = "config",
        ignoreUnknownFields = false
)
@Component
public class Constants {
    private String server;
    private int port;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}

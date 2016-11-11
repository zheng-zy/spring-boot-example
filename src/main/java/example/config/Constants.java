package example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

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
    @NotNull
    private String server;
    @NotNull
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

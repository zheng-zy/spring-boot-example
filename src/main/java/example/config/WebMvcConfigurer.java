package example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * <p>添加拦截器
 * Created by zhezhiyong@163.com on 2016/11/11.
 */
@Configuration
public class WebMvcConfigurer extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new StopWatchHandlerInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

}

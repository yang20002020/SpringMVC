package com.fuyu.config;
import com.fuyu.controller.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {

    @Autowired
    private ProjectInterceptor projectInterceptor;


    //静态页面访问
    @Override
    protected  void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages");
    }

    //拦截器
    @Override
    protected  void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books");
    }


}

package com.fuyu.config;
import com.fuyu.controller.interceptor.ProjectInterceptor;
import com.fuyu.controller.interceptor.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"com.fuyu.controller"})
@EnableWebMvc
public class SpringMvcConfig implements WebMvcConfigurer  {

    @Autowired
    private ProjectInterceptor projectInterceptor;

    @Autowired
    private ProjectInterceptor2 projectInterceptor2;


    //静态页面访问
    @Override
    public  void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages");
    }

    //拦截器
    @Override
    public  void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books");
        registry.addInterceptor(projectInterceptor2).addPathPatterns("/books");
    }
}
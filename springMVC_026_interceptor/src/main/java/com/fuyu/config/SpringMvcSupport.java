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
        //当访问/pages/????时候，不要走springMVC, 而是从/pages目录下查找内容
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages");
    }

    //拦截器
    @Override
    protected  void addInterceptors(InterceptorRegistry registry){
        //对/books进行拦截处理
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books");
    }


}

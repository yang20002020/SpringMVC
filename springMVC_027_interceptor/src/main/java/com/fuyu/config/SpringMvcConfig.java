package com.fuyu.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan({"com.fuyu.controller","com.fuyu.config"})
@EnableWebMvc
public class SpringMvcConfig  {


}
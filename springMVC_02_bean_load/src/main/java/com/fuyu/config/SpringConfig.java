package com.fuyu.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan({"com.fuyu.service","com.fuyu.dao"})
public class SpringConfig {
}

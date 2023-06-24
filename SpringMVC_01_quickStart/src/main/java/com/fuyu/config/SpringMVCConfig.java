package com.fuyu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//3.创建Springmvc的配置文件，加载controller对应的bean
@Configuration
@ComponentScan("com.fuyu.controller")
public class SpringMVCConfig {

}

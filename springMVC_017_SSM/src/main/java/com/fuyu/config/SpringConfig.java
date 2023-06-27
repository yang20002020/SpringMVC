package com.fuyu.config;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan({"com.fuyu.service"})
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
public class SpringConfig {
}

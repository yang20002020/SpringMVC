package com.fuyu.config;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import javax.sql.DataSource;
public class JdbcConfig {

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String passWord;
    @Value("${jdbc.url}")
    private String url;

    @Bean
    public DataSource dataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(userName);
        druidDataSource.setPassword(passWord);
        druidDataSource.setUrl(url);
        druidDataSource.setDriverClassName(driver);
        return  druidDataSource;
    }
}

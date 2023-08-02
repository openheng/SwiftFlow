package com.openheng.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by openheng on 2023-08-02.
 */
@Configuration
public class DataSourceConfiguration {

    @Bean(name = "dataSource")
    public DataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/test");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        druidDataSource.setInitialSize(10);
        druidDataSource.setMinIdle(10);
        druidDataSource.setMaxActive(20);
        return druidDataSource;
    }

}

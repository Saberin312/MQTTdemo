package com.example.MQTT.demo.BHR.data;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 12:17 2019/3/15
 *@Modified By:
 */
@Configuration
public class DatabaseConfig {
    @Autowired
    private Environment env;
    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(env.getProperty("jdbc:mysql://localhost:3306/springbootdb"));
        dataSource.setUsername(env.getProperty("root"));//用户名
        dataSource.setPassword(env.getProperty("123456"));//密码
        dataSource.setDriverClassName(env.getProperty("com.mysql.jdbc.Driver"));
        dataSource.setInitialSize(Integer.parseInt(env.getProperty("2")));
        dataSource.setMaxActive(Integer.parseInt(env.getProperty("10")));
        dataSource.setMinIdle(Integer.parseInt(env.getProperty("0")));
        dataSource.setMaxWait(Integer.parseInt(env.getProperty("60000")));
        dataSource.setValidationQuery("SELECT 1");
        dataSource.setTestOnBorrow(false);
        dataSource.setTestWhileIdle(true);
        dataSource.setPoolPreparedStatements(false);
        return dataSource;
    }
}

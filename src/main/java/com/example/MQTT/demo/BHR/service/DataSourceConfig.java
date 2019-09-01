package com.example.MQTT.demo.BHR.service;

//import org.mapstruct.Qualifier;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 23:43 2019/3/19
 *@Modified By:
 */
@Configuration
public class DataSourceConfig {
    @Bean(name = "DataSource")
    @Qualifier("DataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getMyDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "JdbcTimplate")
    public JdbcTemplate jdbcTemplate(
            @Qualifier("Datasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }


}

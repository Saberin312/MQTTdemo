package com.example.MQTT.demo.BHR;

import com.alibaba.druid.pool.DruidDataSource;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import javax.validation.Valid;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MqttApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqttApplication.class, args);
	}
//
//	@Value("${http.url}")
//	private String url;
//
//	@Autowired
//	private org.springframework.core.env.Environment env;
//
//	@Bean
//	public DataSource dataSource() {
//		DruidDataSource dataSource = new DruidDataSource();
//		dataSource.setUrl(env.getProperty("jdbc:mysql://localhost:3306/springbootdb"));
//		dataSource.setUsername(env.getProperty("root"));//用户名
//		dataSource.setPassword(env.getProperty("123456"));//密码
//		dataSource.setDriverClassName(env.getProperty("com.mysql.jdbc.Driver"));
//		dataSource.setInitialSize(Integer.parseInt(env.getProperty("2")));
//		dataSource.setMaxActive(Integer.parseInt(env.getProperty("10")));
//		dataSource.setMinIdle(Integer.parseInt(env.getProperty("0")));
//		dataSource.setMaxWait(Integer.parseInt(env.getProperty("60000")));
//		dataSource.setValidationQuery("SELECT 1");
//		dataSource.setTestOnBorrow(false);
//		dataSource.setTestWhileIdle(true);
//		dataSource.setPoolPreparedStatements(false);
//		return dataSource;
//	}
}

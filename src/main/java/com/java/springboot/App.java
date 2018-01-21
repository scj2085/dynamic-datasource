package com.java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

import com.java.springboot.dynamicDataSource.datasource.DynamicDataSourceRegister;




/**
 * Hello world!
 *
 */
@SpringBootApplication
@Import({ DynamicDataSourceRegister.class }) // 注册动态多数据源
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

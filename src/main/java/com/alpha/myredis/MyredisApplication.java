package com.alpha.myredis;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 搭建基本环境
 * 1。创建数据库数据表结构
 * 2。生成Javabean
 * 3。配置mybatis 环境
 * 		1。配置数据源 application.properties
 * 		2。使用注解版 @mapper接口
 * 		3。
 */
@SpringBootApplication
@MapperScan("com.alpha.myredis.mapper")
public class MyredisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyredisApplication.class, args);
	}

}

package com.doak.springbootMybatisdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.doak.springbootMybatisdemo.mapper")
public class SpringbootMybatisdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisdemoApplication.class, args);
	}

}

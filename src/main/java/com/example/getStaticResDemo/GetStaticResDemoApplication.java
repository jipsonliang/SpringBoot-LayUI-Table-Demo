package com.example.getStaticResDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.example.getStaticResDemo.dao"})
public class GetStaticResDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetStaticResDemoApplication.class, args);
	}

}

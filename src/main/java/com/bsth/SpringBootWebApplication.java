package com.bsth;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootWebApplication {

	@Value("${book.name}")
	private String name;
	@Value("${book.auther}")
	private String auther;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

	@RequestMapping(value = "/")
	String index(){
		return "你好，世界！Hello World！"+"--"+auther+"写了"+name;
	}
}

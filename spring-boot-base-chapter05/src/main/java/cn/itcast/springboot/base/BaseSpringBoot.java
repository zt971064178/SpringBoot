package cn.itcast.springboot.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@SpringBootApplication是SpringBoot项目的核心注解，主要目的是开启自动配置
//main为项目启动的入口
@SpringBootApplication
public class BaseSpringBoot {
	
	@RequestMapping("/")
	public String index() {
		return "Hello Spring Boot" ;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BaseSpringBoot.class, args) ;
	}
}

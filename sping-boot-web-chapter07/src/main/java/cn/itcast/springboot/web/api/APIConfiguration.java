package cn.itcast.springboot.web.api;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration
@Configuration
@EnableWebMvc
@EnableSwagger2
@ComponentScan("cn.itcast.springboot.web.api")
public class APIConfiguration {
	@Bean  
	public Docket customDocket(){  
			return new Docket(DocumentationType.SWAGGER_2);  
	}  
}

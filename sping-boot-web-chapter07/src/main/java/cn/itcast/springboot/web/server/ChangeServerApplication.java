package cn.itcast.springboot.web.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class ChangeServerApplication {

	@RequestMapping("/")
	public @ResponseBody String index() {
		return "Hello Spring Boot" ;
	}
	
	// 测试替换启动的服务器为jetty服务器
	public static void main(String[] args) {
		SpringApplication.run(ChangeServerApplication.class, args) ;
	}
	
}

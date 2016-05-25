package cn.itcast.springboot.banner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
// exclude关闭特定的自动配置
// 更换启动banner则，修改banner.txt文件，在网站http://patorjk.com/software/taag/上写任意的
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
// 这可以使用@ImportResource加载xml的配置文件
// @ImportResource({"classpath:some-context.xml" ,"classpath:another-context.xml"})
public class DemoApplicationController {
	
	@RequestMapping("/")
	public @ResponseBody String index() {
		return "Hello Spring Boot!!!" ;
	}
	
	public static void main(String[] args) {
		// SpringBoot使用一个全局的配置文件application.properties或application.yml
		// 放置在src/main/resources目录或者类路径下的/config下
		// 如修改服务器端口8080为8090
		SpringApplication.run(DemoApplicationController.class, args) ;
 		
		// 关闭banner
		/*SpringApplication app = new SpringApplication(DemoApplicationController.class) ;
		app.setShowBanner(false);
		app.run(args) ;*/
		
		// 或者这样关闭banner
		/*new SpringApplicationBuilder(DemoApplicationController.class)
			.showBanner(false)
			.run(args);*/
	}
}

package cn.itcast.springboot.banner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// 组合注解，默认的扫描Bean的规则为本包以及其子包，可以覆盖自己指定，建议将此入口写在根包路径下
// 只能有一个入口,切yml与properties文件只能有一个
@SpringBootApplication
// 设置Debug查看spring boot那些配置开启方法
// 1、在application.properties中debug=true
// 2、STS中设置运行参数，，run as...中VM arguments中加上-Ddebug
public class AuthorApplication {

	@Autowired
	private AuthorSettings authorSettings ;
	
	@RequestMapping("/")
	public String index() {
		return "author name is :" +authorSettings.getName() + " and author age is :" +authorSettings.getAge() ;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AuthorApplication.class, args) ;
	}
	
}

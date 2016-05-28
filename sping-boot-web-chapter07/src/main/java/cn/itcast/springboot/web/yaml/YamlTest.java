package cn.itcast.springboot.web.yaml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangtian
 * yaml的注入测试
 */
@SpringBootApplication
@Controller
public class YamlTest {
	
	@Autowired
	private YamlBean yamlBean ;
	
	@RequestMapping("/yaml")
	public @ResponseBody String getYaml() {
		
		return yamlBean.getUsername() ;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(YamlTest.class, args) ;
	}
}

package cn.itcast.springboot.web.yaml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author zhangtian
 * yaml参数注入
 */
@Component
@ContextConfiguration(initializers = ConfigFileApplicationContextInitializer.class)
@PropertySource(value = "classpath:db.properties")
public class YamlBean {
	@Value("${db.url}")
	private String url ;
	@Value("${db.username}")
	private String username ;
	@Value("${db.password}")
	private String password ;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

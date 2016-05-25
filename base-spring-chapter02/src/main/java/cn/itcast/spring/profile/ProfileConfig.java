package cn.itcast.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/*
 * 不同的环境使用不同的配置
 */
@Configuration
public class ProfileConfig {

	/*
	 * 开发环境
	 */
	@Bean
	@Profile("dev")
	public DemoBean devDemoBean() {
		return new DemoBean("from development profile") ;
	}
	
	/*
	 * 生产环境
	 */
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean() {
		return new DemoBean("from production profile") ;
	}
}

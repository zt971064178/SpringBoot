package cn.itcast.spring.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("cn.itcast.spring.prepost")
public class PrePostConfig {

	/*
	 * 通过Bean的方法实现Bean的初始化与销毁
	 */
	@Bean(initMethod="init", destroyMethod="destory")
	public BeanWayService beanWayService(){
		return new BeanWayService() ;
	}
	
	/*
	 * 通过JSR250实现Bean的初始化与销毁
	 */
	@Bean
	public JSR250Service jsr250Service() {
		return new JSR250Service() ;
	}
	
}

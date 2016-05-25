package cn.itcast.spring.ioc.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * Java配置
 * 一般全局配置使用java配置  
 * 业务逻辑配置使用注解配置
 */
@Configuration
public class JavaConfig {
	/*
	 * 返回的是一个Bean，Bean的名字为方法的名称
	 */
	@Bean
	public FunctionService functionService() {
		return new FunctionService() ;
	}
	
	/*@Bean
	public UseFunctionService useFunctionService() {
		UseFunctionService useFunctionService = new UseFunctionService() ;
		useFunctionService.setFunctionService(functionService());
		return useFunctionService ;
	}*/
	
	/*
	 * Spring中存在的Bean，也可以在另一个Bean的声明方法中的参数注入
	 */
	@Bean
	public UseFunctionService useFunctionService(FunctionService functionService) {
		UseFunctionService useFunctionService = new UseFunctionService() ;
		useFunctionService.setFunctionService(functionService);
		return useFunctionService ;
	}
	
}

package cn.itcast.spring.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.itcast.spring.conditional")
public class ConditionalConfig {

	// 传条件参数判断系统类别，根据不同的类别初始化不同的Service
	@Conditional(WindowsCondition.class)
	@Bean
	public ListService getWindowsListService() {
		return new WindowsListService() ;
	}
	
	@Conditional(LinuxCondition.class)
	@Bean
	public ListService getLinuxListService() {
		return new LinunxListService() ;
	}
}

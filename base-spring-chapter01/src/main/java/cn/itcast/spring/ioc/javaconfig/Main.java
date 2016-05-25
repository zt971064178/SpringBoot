package cn.itcast.spring.ioc.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 注解形式实现依赖注入
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class) ;
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class) ;
		System.out.println(useFunctionService.sayHello("Spring Boot 实战")) ;
		context.close();
	}
}

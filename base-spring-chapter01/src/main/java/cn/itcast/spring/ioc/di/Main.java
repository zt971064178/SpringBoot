package cn.itcast.spring.ioc.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 注解形式实现依赖注入
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class) ;
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class) ;
		System.out.println(useFunctionService.sayHello("Spring Boot")) ;
		context.close();
	}
}

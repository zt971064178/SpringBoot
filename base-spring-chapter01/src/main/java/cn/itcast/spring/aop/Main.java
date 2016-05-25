package cn.itcast.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 注解形式实现依赖注入
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class) ;
		
		DemoAnnotationService annotationService = context.getBean(DemoAnnotationService.class) ;
		annotationService.add();
		
		DemoMethodService methodService = context.getBean(DemoMethodService.class) ;
		methodService.add(); 
		
		context.close();
	}
}

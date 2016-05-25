package cn.itcast.spring.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class) ; 
		DemoService demoService = context.getBean(DemoService.class) ;
		
		demoService.outPutResult();
		context.close();
	}
}

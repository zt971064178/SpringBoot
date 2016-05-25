package cn.itcast.spring.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class) ;
		
		BeanWayService beanWayService = context.getBean(BeanWayService.class) ;
		
		JSR250Service jsr250Service = context.getBean(JSR250Service.class) ;
		
		context.close();
	}
}

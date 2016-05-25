package cn.itcast.spring.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class) ;
		
		AwareService awareService = context.getBean(AwareService.class) ;
		awareService.outPutResource();
		
		context.close();
	}
	
}

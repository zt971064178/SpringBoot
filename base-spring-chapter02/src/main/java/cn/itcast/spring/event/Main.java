package cn.itcast.spring.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class) ;
		
		DemoPublisher demoPublisher = context.getBean(DemoPublisher.class) ;
		// 发布事件，Spring监听器监听事件处理
		demoPublisher.publish("Hello Spring Boot 实战");
		
		context.close();
	}
}

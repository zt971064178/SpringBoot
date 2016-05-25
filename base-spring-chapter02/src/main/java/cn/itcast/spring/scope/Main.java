package cn.itcast.spring.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * 单例与多例
 */
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class) ;
		
		DemoSingleService s1 = context.getBean(DemoSingleService.class) ;
		DemoSingleService s2 = context.getBean(DemoSingleService.class) ;
		
		DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class) ;
		DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class) ;
		
		System.out.println("单例模式:"+(s1 == s2));
		System.out.println("多例模式:"+(p1 == p2));
			
		context.close(); 
	}
}

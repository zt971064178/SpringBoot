package cn.itcast.spring.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * 不同的环境使用不同的配置
 */
public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext() ;
		
		context.getEnvironment().setActiveProfiles("dev");
		context.register(ProfileConfig.class);
		context.refresh();
		
		DemoBean bean = context.getBean(DemoBean.class) ;
		System.out.println(bean.getContent());
		
		context.close();
	}
	
}

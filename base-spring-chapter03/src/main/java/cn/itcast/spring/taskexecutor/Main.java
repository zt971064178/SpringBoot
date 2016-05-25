package cn.itcast.spring.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecuorConfig.class) ;
		
		AsyncService asyncService = context.getBean(AsyncService.class) ;
		
		// 结果是并发执行的而不是顺序执行的
		for(int i = 0 ;i < 10; i++) {
			asyncService.executeAsyncTask(i);
			asyncService.executesyncTaskPlus(i);
		}
		
		context.close();
	}
}

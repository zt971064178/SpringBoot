package cn.itcast.spring.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
// 任务执行类
@Service
public class AsyncService {

	// 注解改发布方法是一个异步方法，如果在类上，则类内部所有方法都是异步的
	// 这里的方法被自动注入使用ThreadPoolTaskExecutor作为TaskExecutor
	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("执行异步任务"+i);
	}
	
	public void executesyncTaskPlus(Integer i) {
		System.out.println("执行异步任务+1："+(i+1));
	}
	
}

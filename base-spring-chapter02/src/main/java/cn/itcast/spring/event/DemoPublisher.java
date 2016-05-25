package cn.itcast.spring.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoPublisher {

	/*
	 * 注入ApplicationContext来发布事件
	 * 使用publishEvent方法来发布
	 */
	@Autowired
	private ApplicationContext applicationContext ;
	
	public void publish(String msg) {
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}
	
}

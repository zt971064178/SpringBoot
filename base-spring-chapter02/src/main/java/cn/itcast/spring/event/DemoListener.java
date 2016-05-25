package cn.itcast.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/*
 * 时间监听
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

	/*
	 * 对消息进行接受处理
	 */
	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg() ;
		
		System.out.println("我(DemoListener)接收到了bean-demoPublisher发布的消息："+msg);
	}

}

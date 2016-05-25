package cn.itcast.spring.springmvc.serverpush;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 服务器端推送技术
 * @author zhangtian
 * 通过Server Send Event服务端发送事件
 */
@Controller
public class SseController {

	// 输出类型为text/event-stream，这是服务器端SSE的支持
	// 演示每5秒向服浏览器推送随机消息
	@RequestMapping(value="/push", produces="text/event-stream")
	public @ResponseBody String push() {
		Random random = new Random() ;
		System.out.println("====================++++++++++++++++++++");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "data:Testing 1,2,3" +random.nextInt() + "\n\n" ;
	}
	
}

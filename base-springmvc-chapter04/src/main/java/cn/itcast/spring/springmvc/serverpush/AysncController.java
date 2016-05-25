package cn.itcast.spring.springmvc.serverpush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

// 异步实现是通过控制器从灵气一个线程返回一个DeferredResult
@Controller
public class AysncController {

	@Autowired
	private PushService pushService ;
	
	@RequestMapping("/defer")
	@ResponseBody
	public DeferredResult<String> deferredCall() {
		// 返回给客户端
		System.out.println("deferred...............");
		return pushService.getAsyncUpdate() ;
	}
	
}

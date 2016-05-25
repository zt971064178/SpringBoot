package cn.itcast.spring.springmvc.serverpush;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;

// 产生DeferredResult供控制器使用
@Service
public class PushService {

	private DeferredResult<String> deferredResult ;
	
	public DeferredResult<String> getAsyncUpdate() {
		deferredResult = new  DeferredResult<String>() ;
		return deferredResult ;
	}
	
	// 定时更新DeferredResult
	@Scheduled(fixedRate=5000)
	public void refresh() {
		if(deferredResult != null) {
			deferredResult.setResult(new Long(System.currentTimeMillis()).toString()) ;
		}
	}
	
}

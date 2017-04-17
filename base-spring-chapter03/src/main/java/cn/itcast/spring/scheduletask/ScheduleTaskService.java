package cn.itcast.spring.scheduletask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

// 计划任务
@Service
public class ScheduleTaskService {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss") ;
	
	// 申明这是一个计划任务  每隔5秒钟执行
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("每隔五秒执行一次："+sdf.format(new Date()));
	}
	
	// 申明这是一个计划任务  每天的10点16分执行
	@Scheduled(cron = "0 33 10 ? * *")
	public void fixTimeExecution() {
		System.out.println("在指定时间:"+sdf.format(new Date())+"执行");
	}
}

package cn.itcast.spring.scheduletask;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("cn.itcast.spring.scheduletask")
// 开启对计划任务的支持
@EnableScheduling
public class ScheduleTaskConfig {

}

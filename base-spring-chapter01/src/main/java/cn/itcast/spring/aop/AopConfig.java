package cn.itcast.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
 * 配置类
 */
@Configuration
@ComponentScan("cn.itcast.spring.aop")
@EnableAspectJAutoProxy // 开启Spring对Aspectj支持
public class AopConfig {

}

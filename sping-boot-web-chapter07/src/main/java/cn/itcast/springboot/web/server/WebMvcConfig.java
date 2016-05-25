package cn.itcast.springboot.web.server;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*
 * 检测配置配置类，继承WebMvcConfigurerAdapter能否在spring boot中自动注入
 * 经过检测可以在启启动时修改默认配置
 * 接管Spring boot的wb项目
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		System.out.println("检测配置配置类，继承WebMvcConfigurerAdapter能否在spring boot中自动注入");
		super.addViewControllers(registry);
	}
	
}

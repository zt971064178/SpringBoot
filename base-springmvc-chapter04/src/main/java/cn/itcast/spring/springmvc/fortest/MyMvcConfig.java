package cn.itcast.spring.springmvc.fortest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

// 重写addInterceptors方法，加入自定义的拦截器
// 该配置修改完之后要想在启动时效则需要在上面包中的WebInitializer类
// 注册该配置context.register(MyMvcConfig.class);
@Configuration
//卡其SpringMVC支持，否则无效
@EnableWebMvc
@ComponentScan("cn.itcast.spring.springmvc.fortest")
public class MyMvcConfig extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver viewResouler() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver() ;
		viewResolver.setPrefix("/WEB-INF/classes/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setViewClass(JstlView.class);
		return viewResolver ;
	}
	
	// 配置映射页面
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

	}
	
	// 重写addResourceHandlers方法，addResourceLocations为文件放置目录，addResourceHandler对外暴露的访问路径
	// <!-- 请注意：js/css静态资源文件可以直接访问的必须要在MyMvcConfig配置中配置直接访问，否则文件无法访问  -->
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/") ;
	}
	
	
}

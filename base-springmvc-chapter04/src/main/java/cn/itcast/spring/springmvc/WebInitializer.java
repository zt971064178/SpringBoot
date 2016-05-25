package cn.itcast.spring.springmvc;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
// WebApplicationInitializer为Spring提供的用来配置Servlet3.0+的接口,替代web.xml文件
// 实现此接口将会自动被SpringServletContainerInitialize(用来启动servlet3.0的容器)r获取
public class WebInitializer  implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {

		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext() ;
		context.register(cn.itcast.spring.springmvc.serverpush.MyMvcConfig.class);
		// 新建WebApplicationContext，注册配置类，并将其和servletContext关联
		context.setServletContext(servletContext);
		
		// 统一编码  字符控制
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter() ;
		characterEncodingFilter.setEncoding("UTF-8");  
		characterEncodingFilter.setForceEncoding(true);
		javax.servlet.FilterRegistration.Dynamic filter = servletContext.addFilter("encodingFilter", characterEncodingFilter) ;
		filter.addMappingForUrlPatterns( EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD, DispatcherType.INCLUDE), false, "/*");

		// 注册SpringMVC的DispatcherServlet
		Dynamic servlet = servletContext.addServlet("dispatcher", new DispatcherServlet(context)) ;
		servlet.addMapping("/") ;
		// 开启Servlet3.0异步方法的支持
		servlet.setAsyncSupported(true);
		
		servlet.setLoadOnStartup(1);
	}
	
}

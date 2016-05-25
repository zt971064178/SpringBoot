package cn.itcast.springboot.web.jersey;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

/**
 * 注册
 */
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		//加载Resource
		register(HelloResource.class);

		//注册数据转换器
		register(JacksonJsonProvider.class);

		// Logging.
		register(LoggingFilter.class);
	}
}

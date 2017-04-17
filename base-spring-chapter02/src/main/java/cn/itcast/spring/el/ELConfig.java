package cn.itcast.spring.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("cn.itcast.spring.el")
// 诸如配置配件使用，使用@PropertySource指定文件地址，
// 若使用@Value注入，则需要配置PropertySourcesPlaceholderConfigurer的Bean
// 还可以从Environment中获取property文件中的内容
@PropertySource(value = "classpath:test.properties",ignoreResourceNotFound = true)
public class ELConfig {

	// 注入普通字符串
	@Value("I love you")
	private String normal ;
	
	// 注入系统属性
	@Value("#{systemProperties['os.name']}")
	private String osName ;
	
	// 注入表达式结果
	@Value("#{T (java.lang.Math).random() * 200.0}")
	private double randomNumber ;
	
	// 注入其他Bean属性
	@Value("#{demoService.another}")
	private String fromAnother ;
	
	// 注入文件资源
	@Value("classpath:test.txt")
	private Resource testFile ;
	
	// 注入网址资源
	@Value("http://www.baidu.com")
	private Resource testUrl ;
	
	@Value("${book.name}")
	private String bookName ;
	
	@Autowired
	private Environment environment ;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
		return new PropertySourcesPlaceholderConfigurer() ;
	}
	
	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

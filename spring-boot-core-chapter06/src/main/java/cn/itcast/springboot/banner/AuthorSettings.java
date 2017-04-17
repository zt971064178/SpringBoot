package cn.itcast.springboot.banner;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// 通过@ConfigurationProperties加载properties文件内的配置
// 通过prefix属性指定properties的配置的前缀
// 通过locations指定properties文件的 位置，如：@ConfigurationProperties(prefix="author",locations={"classpath:config/author.properties"})
// 本例不需要配置locations
@ConfigurationProperties(prefix="author")
public class AuthorSettings{

	private String name ;
	private int age ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

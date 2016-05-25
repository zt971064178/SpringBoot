package cn.itcast.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

	// 注入普通字符
	@Value(value="其他属性")
	private String another ;

	public String getAnother() {
		return another;
	}

	public void setAnothor(String another) {
		this.another = another;
	}
}

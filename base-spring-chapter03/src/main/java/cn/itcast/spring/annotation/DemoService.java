package cn.itcast.spring.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public void outPutResult() {
		System.out.println("从组合注解一样获取Bean");
	}
}

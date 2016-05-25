package cn.itcast.spring.ioc.di;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
	public String sayHello(String world) {
		return "Hello " + world ;
	}
}

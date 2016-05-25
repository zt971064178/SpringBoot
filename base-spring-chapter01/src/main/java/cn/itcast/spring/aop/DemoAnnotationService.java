package cn.itcast.spring.aop;

import org.springframework.stereotype.Service;

/*
 * 注解拦截Service
 */
@Service
public class DemoAnnotationService {
	@Action(name="注解拦截")
	public void add() {}
}

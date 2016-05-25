package cn.itcast.spring.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
 * 通过JSR250实现Bean的初始化与销毁
 */
public class JSR250Service {

	/*
	 * 在Bean构造函数执行之后执行
	 */
	@PostConstruct
	public void init(){
		System.out.println("@jsr250-init-method");
	}
	
	public JSR250Service(){
		super() ;
		System.out.println("初始构造着函数-JSR250Service");
	}
	
	/*
	 * 在Bean销毁之前执行
	 */
	@PreDestroy
	public void destory(){
		System.out.println("@jsr250-destory-method");
	}
	
}



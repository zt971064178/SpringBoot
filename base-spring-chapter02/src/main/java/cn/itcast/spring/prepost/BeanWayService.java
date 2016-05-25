package cn.itcast.spring.prepost;

public class BeanWayService {

	public void init(){
		System.out.println("@Bean-init-method");
	}
	
	public BeanWayService(){
		super() ;
		System.out.println("初始构造着函数-BeanWayService");
	}
	
	public void destory(){
		System.out.println("@Bean-destory-method");
	}
	
}

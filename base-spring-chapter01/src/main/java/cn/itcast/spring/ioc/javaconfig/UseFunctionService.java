package cn.itcast.spring.ioc.javaconfig;

public class UseFunctionService {

	private FunctionService functionService ;
	
	public String sayHello(String world) {
		return functionService.sayHello(world) ;
	}
	
	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
}

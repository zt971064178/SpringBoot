package cn.itcast.spring.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/*
 * 切面
 */
@Aspect
@Component
public class LogAspect {

	@Pointcut("@annotation(cn.itcast.spring.aop.Action)")
	public void annotationPointCut() {}
	
	/*
	 * 注解拦截
	 */
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature() ;
		Method method = methodSignature.getMethod() ;
		Action action = method.getAnnotation(Action.class) ;
		System.out.println("注解式拦截:"+action.name() + ",方法名:"+method.getName());
	}
	
	/*
	 * 方法拦截 
	 */
	@Before("execution(* cn.itcast.spring.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature() ;
		Method method = methodSignature.getMethod() ;
		System.out.println("方法方式拦截:"+method.getName());
	}
	
}

package spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	@Pointcut("execution(public * *(..))")
	private void pointCut() {}
	
	
	@Before("pointCut()")
	public void beforeLogging() {
		System.out.println("** 메서드 호출 전**");
	}
	@AfterReturning(pointcut="pointCut()", returning="returnValue")
	public void afterLogging(Object returnValue) {
		System.out.println("** 메서드 호출 후**");
	}
	@AfterThrowing(pointcut="pointCut()", throwing="ex")
	public void throwingLogging(Exception ex) {
		System.out.println("** 예외 발생 : " + ex.getMessage() + "**");
	}
	@After("pointCut()")
	public void alwaysLogging() {
		System.out.println("** 항상 실행 **");
	}
}

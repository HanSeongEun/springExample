package spring.aop;

import org.springframework.stereotype.Component;

@Component("greeting")
public interface GreetingService {
	public void sayHello(String name);
	public void sayGoodBye(String name) throws Exception;
}

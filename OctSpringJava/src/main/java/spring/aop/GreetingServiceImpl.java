package spring.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("greeting")
public class GreetingServiceImpl implements GreetingService {

	@Value("hi!!")
	private String greeting;
	
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello(String name) {
		System.out.println("sayHello : " + greeting + " : " + name);

	}

	@Override
	public void sayGoodBye(String name) throws Exception {
		System.out.println("sayGoodBye : " + greeting + " : " + name);
		throw new Exception("강제 예외 발생");
	}

}

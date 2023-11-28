package spring.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("f")
public class Foo {
	
	//@Resource
	@Autowired
	Bar bar;
	
	@Value("apple")
	String str;
	
	public void doFoo() {
		System.out.println("Foo.doFoo() 실행");
		bar.doBar();
	}
	
	@PostConstruct
	public void start() {
		System.out.println("초기화 : start()");
	}
	
	@PreDestroy
	public void stop() {
		System.out.println("소멸 : stop()");
	}
	
}

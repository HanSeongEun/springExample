package spring.anno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new GenericXmlApplicationContext("annoTest.xml");

		Foo f1 = context.getBean("f", Foo.class);
		f1.doFoo();
		System.out.println("f1.str : " + f1.str);
		
		Foo f2 = context.getBean("makeFoo", Foo.class);
		f2.doFoo();
		
		context.registerShutdownHook();
	}

}

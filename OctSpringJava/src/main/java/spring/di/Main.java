package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("diTest.xml");

		Foo f = (Foo) context.getBean("foo1");
		f.doFoo();
		
		System.out.println("=========================");
		Foo f2 = context.getBean("foo2", Foo.class);
		System.out.println(f2.i);
		System.out.println(f2.str);
		
		System.out.println("=========================");
		Fooo f3 = context.getBean("fooo1", Fooo.class);
		f3.doFooo();
		System.out.println(f3.i + " : " + f3.str);
		
		System.out.println("=========================");
		Fooo f4 = context.getBean("fooo2", Fooo.class);
		f4.doFooo();
		System.out.println(f4.i + " : " + f4.str);
		
		System.out.println("=========================");
		FooLookUp f5 = context.getBean("fooLookUp", FooLookUp.class);
		f5.doFooLookUp();
		
		System.out.println("=========================");
		Fooo f6 = context.getBean("fooo4", Fooo.class);
		System.out.println(f6.i);
		System.out.println(f6.str);
		
		context.registerShutdownHook();
	}

}

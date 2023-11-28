package spring.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Baz {

	@Bean
	public Foo makeFoo() {
		Foo f = new Foo();
		return f;
	}
	
	
}

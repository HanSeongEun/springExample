package spring.di;

public class Foo {
	Bar bar;
	Baz baz;
	
	int i;
	String str;
	
	public Foo(String s1, String s2) {
		System.out.println("String, String 생성자 실행");
	}
	
	public Foo(int s1, String s2) {
		System.out.println("int, String 생성자 실행");
	}
		
	public Foo(Bar bar, Baz baz) {
		this.bar = bar;
		this.baz = baz;
	}
	
	public Foo(Bar bar, Baz baz, int i, String str) {
		this.bar = bar;
		this.baz = baz;
		this.i = i;
		this.str = str;
	}

	public void doFoo() {
		System.out.println("Foo.doFoo() 실행");
		bar.doBar();
	}
}

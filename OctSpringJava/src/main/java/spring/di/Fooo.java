	package spring.di;

public class Fooo {
	Bar bar;
	String str;
	int i;
	
	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void doFooo() {
		System.out.println("Foo.doFooo() 실행");
		bar.doBar();
	}
}

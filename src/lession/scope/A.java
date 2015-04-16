package lession.scope;

// Diese Klasse wird auf Folie 19
// im Foliensatz zu Scope betrachtet

public class A {
	
	long i = 1;
	
	void output()
	{
		String i = "Hallo";
		System.out.println(i);
		System.out.println(this.i);
	}
	
	public static void main(String[] args)
	{
		A a = new A();
		a.output();
	}

}

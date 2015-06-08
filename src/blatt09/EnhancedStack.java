package blatt09;


public class EnhancedStack extends blatt06.Stack {

	
	// Konstruktor, liefert einen leeren Stapel mit der Maximalhoehe l.
	EnhancedStack(int l) { 
		super(l);
	}
	
	// Ist keine Zahl auf dem Stapel, so wird eine Exception geworfen.
	public int pop() {
		if (empty()) 
			throw new UnsupportedOperationException();
		return super.pop(); 
	}
	
	
	public static void main(String[] args) {
		EnhancedStack stack = new EnhancedStack(50);
		for (int i=0; i<100; i++)
			if (Math.random()<0.5)
				stack.push(i);
			else {
				try {
					System.out.println(stack.pop());
				}
				catch (Exception e) {
					System.out.println("Stack leer!");
				}
			}
	}
	
}
package lesson.swing;

public class CalcFib implements Runnable {

	int value;
	FibGui gui;
	
	CalcFib(FibGui g, int v) {
		value = v;
		gui = g;
	}
	
	@Override
	public void run() {
		long fib = blatt06.Fibonacci.recursive(value);
		gui.setLabelValue(fib);
	}

}

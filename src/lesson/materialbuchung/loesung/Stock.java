package lesson.materialbuchung.loesung;

public class Stock implements GoodsSink, GoodsSource {
	
	private int onStock = 0;

	public boolean deliver(int count) {
		if (count > onStock)
			return false;
		onStock -= count;
		return true;
	}

	public void receive(int count) {
		onStock += count;
	}

	public String toString() {
		return "Lager: " + onStock;
	}

}

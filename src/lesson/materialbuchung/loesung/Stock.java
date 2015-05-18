package lesson.materialbuchung.loesung;

public class Stock implements GoodsSink, GoodsSource {
	
	// Instanzvariable, die den Bestand im Lager festhaelt
	private int onStock = 0;

	// Auslieferung nur, wenn genuegend Bestand
	public boolean deliver(int count) {
		if (count > onStock)
			return false;
		onStock -= count;
		return true;
	}

	// Einlieferung geht immer
	public void receive(int count) {
		onStock += count;
	}

	// Lagerinformation als String
	public String toString() {
		return "Lager: " + onStock;
	}

}

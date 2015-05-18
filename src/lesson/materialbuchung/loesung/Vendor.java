package lesson.materialbuchung.loesung;

public class Vendor extends Partner implements GoodsSource{
	
	
	public Vendor(String name, String city) {
		super(name, city);
	}

	public boolean deliver(int count) {
		return true;
	}

	public String toString()
	{
		return "Lieferant:" + super.toString();
	}

}

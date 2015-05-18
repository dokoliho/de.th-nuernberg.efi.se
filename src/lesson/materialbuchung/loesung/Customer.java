package lesson.materialbuchung.loesung;

public class Customer extends Partner implements GoodsSink{

	private int delivered = 0;
	
	public Customer(String name, String city) {
		super(name, city);
	}

	public void receive(int count) {
		delivered += count;
	}
	
	public String toString()
	{
		return "Kunde:" + super.toString();
	}
	
	public void sendInvoice()
	{
		System.out.println(toString());
		System.out.println(delivered);
		delivered = 0;
	}

}

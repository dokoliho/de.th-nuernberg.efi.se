package lesson.klausurvorbereitung;

public class Betrag {

	
	static int abs(int value)
	{
		if (value < 0)
			return value * -1;
		return value;
	}
	
	static double abs(double value)
	{
		if (value < 0.0)
			return value * -1.0;
		return value;
	}
	
	
	public static void main(String[] args) {
		System.out.println(Betrag.abs(4));
		System.out.println(Betrag.abs(-4));
		System.out.println(Betrag.abs(4.0));
		System.out.println(Betrag.abs(-4.0));	
	}

}

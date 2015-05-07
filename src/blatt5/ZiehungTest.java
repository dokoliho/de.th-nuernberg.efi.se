package blatt5;

import org.junit.*;
import static org.junit.Assert.*;

public class ZiehungTest {

	// Test, ob die Zahlen auch nur einmal vorkommen
	@Test
	public void TestUnique() {
		Ziehung z = new Ziehung();
		int[] numbers = z.getNumbers();

		for (int i=0; i<numbers.length; i++)
			for (int j=0; j<i; j++)
				assertNotEquals(numbers[i], numbers[j]);
	}

	
	// Test, ob die Zahlen im zulaessigen Bereich sind
	@Test
	public void TestRange() {
		Ziehung z = new Ziehung();
		int[] numbers = z.getNumbers();
		
		for (int i=0; i<numbers.length; i++)
		{
			assertTrue(numbers[i]>0);
			assertTrue(numbers[i]<50);
		}
		
	}

	
}

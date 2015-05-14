package blatt8;

import static org.junit.Assert.*;

import org.junit.*;


public class Testcase {
		
	private void TestEuroCent(int euro, int cent, int count)
	{
		SimpleChangeCalculator calc = new EnhancedChangeCalculator();
		int[] result = calc.getChange(euro, cent);
		assertNotNull("Return-Array darf nicht null sein", result);
		assertEquals("Return-Array hat die falsche Laenge!",8, result.length);
		
		int returnedValue = 0;
		int returnedCoinCount = 0;
		for (int i = 0; i< Coin.availableCoins.length; i++)
		{
			returnedCoinCount += result[i];
			returnedValue += result[i] * Coin.availableCoins[i].value();
		}
		assertEquals("Wert der Muenzen stimmt nicht!", euro*100+cent, returnedValue);
		assertTrue("Zu viele Muenzen ausgegeben!", returnedCoinCount <= count);
	}
		
	@Test
	public void Test5Euro90()
	{
		TestEuroCent(5,90, 6);
	}

	@Test
	public void Test13Euro45()
	{
		TestEuroCent(13,45, 10);
	}
	
	@Test
	public void Test9Euro99()
	{
		TestEuroCent(9,99, 11);
	}
	
	@Test
	public void TestBigAmount()
	{
		TestEuroCent(2581,17, 1294);
	}

	
}

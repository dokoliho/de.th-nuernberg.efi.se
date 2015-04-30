package lesson.rekursion;

import org.junit.*;
import static org.junit.Assert.*;

public class FakultaetTest {

	@Test
	public void TestIteration() {

		// Arrange
		long n = 6;
		long expected = 1 * 2 * 3 * 4 * 5 * 6;
		Fakultaet f = new Fakultaet();

		// Act
		long result = f.fakultaet_iterativ(n);

		// Assert
		assertEquals(expected, result);
	}
	

	@Test
	public void TestRekursion() {

		// Arrange
		long n = 6;
		long expected = 1 * 2 * 3 * 4 * 5 * 6;
		Fakultaet f = new Fakultaet();

		// Act
		long result = f.fakultaet_rekursiv(n);

		// Assert
		assertEquals(expected, result);
	}
	
}

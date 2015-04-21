package lesson.test;

import org.junit.*;
import static org.junit.Assert.*;

//Klasse findet bei Folie 29ff Verwendung

public class TestPunkt {

	@Test
	public void TestGetter() {

		// Arrange
		int x = 17;
		int y = 10;
		Punkt p = new Punkt(x, y);

		// Act
		int gotX = p.getX();
		int gotY = p.getY();

		// Assert
		assertEquals(x, gotX);
		assertEquals(y, gotY);
	}

}

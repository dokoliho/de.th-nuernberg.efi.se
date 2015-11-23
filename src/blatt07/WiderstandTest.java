package blatt07;

import org.junit.*;
import static org.junit.Assert.*;

public class WiderstandTest {

	// Liefert ein einfacher Widerstand den richtigen Wert?
	@Test
	public void TestSimpleResistor() {
		double value = Math.random() * 1000 + 1;
		Widerstand e = new EinfacherWiderstand(value);
		assertEquals(value, e.getOhm(), 0.1);
	}

	// Liefert eine Reihenschaltung von zwei
	// einfachen Widerstaenden den richtigen Wert?
	@Test
	public void TestSimpleSerial() {
		double value1 = Math.random() * 1000 + 1;
		double value2 = Math.random() * 1000 + 1;
		Widerstand e1 = new EinfacherWiderstand(value1);
		Widerstand e2 = new EinfacherWiderstand(value2);
		Widerstand r = new ReihenSchaltung(e1, e2);
		assertEquals(value1 + value2, r.getOhm(), 0.1);
	}

	// Liefert eine Parallelschaltung von zwei
	// einfachen Widerstaenden den richtigen Wert?
	@Test
	public void TestSimpleParallel() {
		double value1 = Math.random() * 1000 + 1;
		double value2 = Math.random() * 1000 + 1;
		Widerstand e1 = new EinfacherWiderstand(value1);
		Widerstand e2 = new EinfacherWiderstand(value2);
		Widerstand r = new ParallelSchaltung(e1, e2);
		assertEquals(1 / value1 + 1 / value2, 1 / r.getOhm(), 0.1);
	}

}

package blatt7;

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

	// Funktioniert auch ein komplizierteres Netz?
	@Test
	public void TestResistorNet() {
		Widerstand r1 = new EinfacherWiderstand(100.0);
		Widerstand r2 = new EinfacherWiderstand(200.0);
		Widerstand reihe1 = new ReihenSchaltung(r1, r2);
		assertEquals(300.0, reihe1.getOhm(), 0.1);
		Widerstand r3 = new EinfacherWiderstand(600.0);
		Widerstand parallel1 = new ParallelSchaltung(reihe1, r3);
		assertEquals(200.0, parallel1.getOhm(), 0.1);
		Widerstand r4 = new EinfacherWiderstand(200.0);
		Widerstand parallel2 = new ParallelSchaltung(parallel1, r4);
		assertEquals(100.0, parallel2.getOhm(), 0.1);
		Widerstand r5 = new EinfacherWiderstand(300.0);
		Widerstand reihe2 = new ReihenSchaltung(parallel2, r5);
		assertEquals(400.0, reihe2.getOhm(), 0.1);
	}
}

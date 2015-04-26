package blatt6;

import org.junit.*;
import static org.junit.Assert.*;

public class TestStack {

	// Ist ein neuer Stack auch leer?
	@Test
	public void TestEmptyNewStack() {
		Stack stack = new Stack(5);
		assertTrue("Neuer Stapel muss leer sein!", stack.empty());
	}

	// Ist ein Stack nach dem Hinzufuegen eines Werts auch nicht mehr leer?
	@Test
	public void TestNotEmptyStack() {
		Stack stack = new Stack(5);
		stack.push(3);
		assertFalse("Stapel nach push darf nicht leer sein!", stack.empty());
	}

	// Kann ein mit gepushter Wert gleich mit pop ausgelesen werden?
	// Auch wenn zuvor versucht wurde, aus einem leeren Stack zu lesen?
	@Test
	public void TestPopPushPopSequence() {
		Stack stack = new Stack(5);
		stack.pop();
		stack.push(4);
		int i = stack.pop();
		assertEquals("Stapel liefert falschen Wert!", 4, i);
	}

	// Nimmt ein Stack genau die geforderte Anzahl an Werten auf?
	@Test
	public void TestStackSize() {
		int size = 5;
		Stack stack = new Stack(size);
		for (int i = 1; i <= size; i++)
			assertTrue("Stack der Groeße 5 liefert beim " + i + ". Push false!", stack.push(i));
		assertFalse("Stack der Groeße 5 liefert beim 6. Push true!", stack.push(6));
	}

	// Kann aus einem leeren Stack gelesen werden, ohne dass das Program abstuerzt?
	@Test
	public void TestPopEmptyStack() {
		int size = 5;
		Stack stack = new Stack(size);
		stack.pop();
	}

	// Werden mehrere eingefuegte Elemente in umgekehrter Reihenfolge ausgegeben?
	@Test
	public void TestStackFIFO() {
		int[] sequence = new int[] { 4, 17, 2, 8 };
		Stack stack = new Stack(sequence.length);
		for (int i = 0; i < sequence.length; i++)
			assertTrue(stack.push(sequence[i]));
		for (int i = sequence.length-1; i >= 0; i--)
			assertEquals("Stack liefert falschen Wert!", sequence[i], stack.pop());
	}	
}

package lesson.data;

public class Queue {
	
	// Private Attribute: Datenspeicher, Schreib- und Leseindex
	private int[] data;
	private int write_index;
	private int read_index;
	
	// Konstruktor: Initialisierung der Attribute
	public Queue(int size) {
		data = new int[size];
		write_index = 0;
		read_index = 0;
	}
	
	// Die Queue ist leer, wenn der Leseindex zum Schreibindex aufgeschlossen hat
	public boolean empty() {
		return (read_index >= write_index);
	}

	// Auslesen mittels Leseindex
	public int dequeue() {
		if (empty()) return 0;
		return data[read_index++ % data.length];
	}

	// Einfuegen mittels Schreibindex
	public boolean enqueue(int i) {
		if (full()) return false;
		data[write_index++ % data.length] = i;
		return true;	
	}

	// Die Queue ist voll, wenn der Schreibindex den Leseindex ueberrundet
	public boolean full() {
		return (write_index >= read_index + data.length);
	}
	
	// Test: Wechselseitiges Schreiben/Lesen von 8 Einträgen in einen
	// Ringpuffer der Laenge 5
	public static void main(String args[]) {
		
		Queue queue = new Queue(5);
		
		for (int i = 1; i < 8; i++) {
			if (queue.full())
				System.out.println("Queue voll!");
			else 
				queue.enqueue(i);
			if (queue.empty())
				System.out.println("Queue leer!");
			else 
				System.out.println(queue.dequeue());
		}
	
	}
	
}

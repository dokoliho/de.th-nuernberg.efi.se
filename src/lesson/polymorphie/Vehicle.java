package lesson.polymorphie;

abstract public class Vehicle {

	abstract public void driveTo();
	
	public static void main(String[] args) {

		Vehicle v = null;
		if (Math.random()<0.5)
			v = new Car();
		else
			v = new Train();
		v.driveTo();
	}

}

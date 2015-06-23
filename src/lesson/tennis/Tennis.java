package lesson.tennis;

public class Tennis {
	
	int LOVE = 0;
	int FIFTEEN = 1;
	int THIRTY = 2;
	int FORTY = 3;
	int ADVANTAGE = 4;
	int WON = 6;
	String[] points = {"Love", "15", "30", "40", 
			"Vorteil", "60", "Gewonnen"};
	
	int pointsOfA = LOVE;
	int pointsOfB = LOVE;
	
	
	int pointForX(int pointsOfX, int pointsOfY)
	{
		if (pointsOfX == FORTY)
			if (pointsOfY < FORTY) {
				return WON;
			}
		if (pointsOfX == ADVANTAGE) {
			return WON;
		}
		return pointsOfX+1;
		
	}
	
	
	void pointForA()
	{
		pointsOfA = pointForX(pointsOfA, pointsOfB);
	}
	
	void pointForB()
	{
		pointsOfB = pointForX(pointsOfB, pointsOfA);
	}
	
	public String toString()
	{
		return "Ergebnis " + points[pointsOfA] + ":" + points[pointsOfB];
	}

	public static void main(String[] args) {

		Tennis t = new Tennis();
		
		t.pointForA();
		t.pointForB();
		t.pointForB();
		t.pointForB();
		t.pointForB();
		System.out.println(t.toString());
		
	}

}

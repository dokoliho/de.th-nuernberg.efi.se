package lesson.tennis;

public class Tennis {
	
	final int LOVE = 0;
	final int FIFTEEN = 1;
	final int THIRTY = 2;
	final int FORTY = 3;
	final int ADVANTAGE = 4;
	final int WON = 6;
	String[] points = {"Love", "15", "30", "40"};
	
	int pointsOfA = LOVE;
	int pointsOfB = LOVE;
	
	
	
	void pointForA()
	{
		pointsOfA++; 
	}
	
	void pointForB()
	{
		pointsOfB++;
	}
	
	public String toString()
	{
		if (hasAWon()) return "A hat gewonnen";
		if (hasBWon()) return "B hat gewonnen";
		if ( hasXAdvantage(pointsOfA, pointsOfB) ) return "Vorteil A";
		if ( hasXAdvantage(pointsOfB, pointsOfA) ) return "Vorteil B";
		if ( isDeuce(pointsOfA, pointsOfB) ) return "Einstand";
		return points[pointsOfA] + ":" + points[pointsOfB];
	}

	private boolean isDeuce(int x, int y)
	{
		if ( (x >= FORTY)  && (x == y) )
			return true;
		return false;		
	}

	
	private boolean hasXAdvantage(int x, int y)
	{
		if ( (x > FORTY)  && (x >y) )
			return true;
		return false;		
	}
	
	
	private boolean hasXWon(int x, int y)
	{
		if ( (x > FORTY)  && (x >= y+2) )
			return true;
		return false;		
	}
	
	private boolean hasAWon() {
		return hasXWon(pointsOfA, pointsOfB);
	}

	
	private boolean hasBWon() {
		return hasXWon(pointsOfB, pointsOfA);
	}

	
	public static void main(String[] args) {

		Tennis t = new Tennis();
		
		while (!(t.hasAWon() || t.hasBWon()))
		{
			if (Math.random() < 0.5)
				t.pointForA();
			else
				t.pointForB();
			System.out.println(t.toString());			
		}
		
		
	}

}

package lesson.array;

public class WuerfelTest {
	
	public static void main(String[] args)
	{
		int[] haeufigkeit = new int[] {0, 0, 0, 0, 0, 0};
		Wuerfel wuerfel = new Wuerfel();
		for (int i = 1; i<= 10000; i++)
		{
			int zahl = wuerfel.gewuerfelteZahl();
			haeufigkeit[zahl-1]++;
		}
		for (int i=0; i < haeufigkeit.length; i++)
			System.out.println (i+1 + ": " + haeufigkeit[i]);
	}
	
}

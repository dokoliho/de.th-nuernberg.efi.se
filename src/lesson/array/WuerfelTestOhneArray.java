package lesson.array;

// Entspricht Folie 14

public class WuerfelTestOhneArray {
	
	public static void main(String[] args)
	{
		int einer = 0, zweier = 0, dreier = 0, vierer = 0, fuenfer = 0, sechser = 0;
		Wuerfel wuerfel = new Wuerfel();
		for (int i = 1; i<= 10000; i++)
		{
			int zahl = wuerfel.gewuerfelteZahl();
			if (zahl==1) einer++;
			if (zahl==2) zweier++;
			if (zahl==3) dreier++;
			if (zahl==4) vierer++;
			if (zahl==5) fuenfer++;
			if (zahl==6) sechser++;
		}
		System.out.println ("1:" + einer + " 2:" + zweier + " 3:" + dreier);
		System.out.println ("4:" + vierer + " 5:" + fuenfer + " 6:" + sechser);
	}
	
}

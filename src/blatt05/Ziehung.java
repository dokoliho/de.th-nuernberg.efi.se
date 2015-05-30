package blatt05;

public class Ziehung {
	
	private int[] numbers = new int[6];
	
	private boolean uniqueSequenceUpTo(int index)
	{
		for (int j=0; j<index; j++)
			if (numbers[j]==numbers[index]) return false;
		return true;
	}
	
	private void sort()
	{
		for (int i=0; i<numbers.length; i++)
			for (int j=i+1; j<numbers.length; j++)
				if (numbers[j] < numbers[i]) {
					int h = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = h;
				}
	}
	
	
	public Ziehung()
	{
		for (int i=0; i<numbers.length; i++)
			do {
				numbers[i] = (int) (Math.random()*49+1);
			} while (!uniqueSequenceUpTo(i));
		sort();
	}
	
	public int[] getNumbers()
	{
		return numbers;
	}
	
	public static void main(String[] args)
	{
		Ziehung z = new Ziehung();
		for (int i=0; i<z.getNumbers().length; i++)
			System.out.println(z.getNumbers()[i]);
	}

}

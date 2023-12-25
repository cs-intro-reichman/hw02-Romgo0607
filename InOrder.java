/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) 
	{
		int biggestNum = ((int)(Math.random() * 10));
		System.out.print(biggestNum);

		int num;

		while(biggestNum < 9)
			{
				num = ((int)(Math.random() * 10));
				if(num >= biggestNum)
					{
						System.out.print(" " + num);
						biggestNum = num;
					}
			}

	}
}

/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) 
	{
		int num = Integer.parseInt(args[0]);
		int sum = 0;

		String pelet = "";

			for(int i = 1; i < num; i++)
			{
				if(num % i == 0)
				{
					pelet = pelet + " + " + i;
					sum = sum + i;
				}
			}

			if(sum == num)
				{
					System.out.print(num + " is a perfect number since " + num + " = ");
					System.out.print(pelet);
				}
			else
				{
					System.out.print(num + " is not a perfect number");
				}
	}
}

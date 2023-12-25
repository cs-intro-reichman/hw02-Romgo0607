/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) 
	{
		int num = Integer.parseInt(args[0]);
		int sum = 1;

		String pelet = "";

			for(int i = 2; i < num; i++)
			{
				if(num % i == 0)
				{
					pelet = pelet + " + " + i;
					sum = sum + i;
				}
			}

			if(sum == num)
				{
					System.out.print(num + " is a perfect number since 1");
					System.out.print(pelet + " = " + num);
				}
			else
				{
					System.out.print(num + " is not a perfect number");
				}
	}
}

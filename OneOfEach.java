
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) 
	{
		int boyORgirl;
		char guess;
		int boys = 0;
		int girls = 0;


		while((girls < 2) && (boys < 2))
		{
			boyORgirl = (int)(Math.random() * 2);
			
			if(boyORgirl == 0)
			{
				guess = 'g';
				girls++;
			}
			else
			{
				guess = 'b';
				boys++;
			}

			System.out.print(" " + guess);
		}
		System.out.println();
		System.out.println("You made it... and you now have " + (girls + boys)+ " children");
	}
}

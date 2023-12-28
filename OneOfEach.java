
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) 
	{
		int boyORgirl;
		int boys = 0;
		int girls = 0;
		boolean enough = false;

		while(enough == false)
		{
			boyORgirl = (int)(Math.random() * 2);
			if(boyORgirl == 0)
			{
				System.out.print("g ");
				girls++;
			}
			else
			{
				System.out.print("b ");
				boys++;
			}
			if((boys > 0) && (girls > 0))
			{
				System.out.println();
				System.out.println("You made it... and you now have " + (girls + boys) + " children");
				enough = true;
			}
		}
	}
}

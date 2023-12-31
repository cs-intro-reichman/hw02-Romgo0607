/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) 
	{
		int families = Integer.parseInt(args[0]);
		int i = 1;

		int boyORgirl;
		int boys = 0;
		int girls = 0;

		boolean enough = false;

		int sumKidsAvrege = 0;

		int TwoMembers = 0;
		int ThreeMembers = 0;
		int FourOrMoreMembers = 0;

		while(i <= families)
		{
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
					enough = true;
					System.out.println();
					System.out.println("Family number " + i + " has " + (boys + girls) + " kids");
					sumKidsAvrege = sumKidsAvrege + boys + girls;
					if((boys + girls) < 3)
						{
							TwoMembers++;
						}
						else
						{
							if((boys + girls) == 3)
							{
								ThreeMembers++;
							}
							else
							{
								FourOrMoreMembers++;
							}
						}
				}
			}
			i++;
			enough = false;
			boys = 0;
			girls = 0;
		}
		double FamForAvg = families;

		System.out.println("Average: " + (sumKidsAvrege/FamForAvg) + " children to get at least one of each gender.");

		System.out.println("Number of families with 2 children: " + TwoMembers);
		System.out.println("Number of families with 3 children: " + ThreeMembers);
		System.out.println("Number of families with 4 or more children: " + FourOrMoreMembers);

		if((TwoMembers >= ThreeMembers) && (TwoMembers >= FourOrMoreMembers))
			{
				System.out.println("The most common number of children is 2.");
			}
			else
			{
				if(ThreeMembers >= FourOrMoreMembers)
				{
					System.out.println("The most common number of children is 3.");
				}
				else
					System.out.println("The most common number of children is 4 or more.");
			}
	}
}

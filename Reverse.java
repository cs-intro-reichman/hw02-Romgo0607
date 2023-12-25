/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args)
	{
		String word = args[0];
		int middle;
		if(word.length() % 2 == 0) //this means that the length isn't exual
			{
				middle = (word.length() + 1) / 2;
			}
		else
			{
				middle = word.length() / 2;
			}

		char outLetter = word.charAt(middle);
		System.out.println("The middle character is " + outLetter);


		int i = word.length()-1;

		while(i >= 0)
		{
			char letter = word.charAt(i);
			System.out.print(letter);
			i--;
		}
	}
}

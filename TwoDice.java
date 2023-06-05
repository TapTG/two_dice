// Chapter 5 Exercise - 05.16.23, Teri T

public class TwoDice
{
	public static void main(String[] args) 
	{
		// Variables and constants
		String outcome = "";
		Die die1 = new Die();
		Die die2 = new Die();

		// Processing phase
		if(die1.getDieValue() > die2.getDieValue())
		{
			outcome = "The player wins the game!";
		}	// end of first IF statement
		else 
		{
			if(die1.getDieValue() < die2.getDieValue())
			{
				outcome = "The computer has won.";
			}	// end of nested IF statement
			else 
			{
				outcome = "We have a tie game!";
			}	// end of nested ELSE statement
		}	// end of first ELSE statement

		// Output phase
		System.out.println("The player's die roll was a : " + die1.getDieValue());
		System.out.println("The computer's die roll was a : " + die2.getDieValue());
		System.out.println(outcome);
	}	// end of main
}	// end of class
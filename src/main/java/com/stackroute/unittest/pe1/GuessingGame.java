
package com.stackroute.unittest.pe1;


public class GuessingGame
{
	public String Game(int n) {
		int number = 25;
		int guess = 0;
		guess = n;
			if (guess > number)
			{
				return "Number guessed is greater than the original number";
			}
			else if (guess < number)
			{
				return "Number guessed is less than the original number";
			}
			else
			{
				return "Number guessed matches the original number";
			}
	}
}
        
package basic;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
	public static void main(String[] args) {
		/*
		 * Create a game where the program picks a random number from 1 to 100 and the player has to guess it.
		  Each time the player makes a guess, print “HIGHER” 
		  if the guess was too low or “LOWER” if the guess was too high. 
		  If the player correctly guesses the number, print “CORRECT”, 
		  then end the game.

	You can use the line of code below which produces a random number from 1 to 100,
	and stores it in randomNumber.
	int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);*/
		
		Scanner scanner = new Scanner(System.in);
		 
		int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
		int guess;
		 
		System.out.println("--- Guess My Number Game ---");
		 	do {
		 	    System.out.print("\nGuess: ");
		    guess = scanner.nextInt();
		 
		    if (guess < randomNumber) {
		        System.out.println("HIGHER.");
		    }
		    else if (guess > randomNumber) {
		        System.out.println("LOWER.");
		    }
		    else {
		        System.out.println("CORRECT. My number was " + randomNumber + ".");
		    }
		 
		} while (guess != randomNumber);
	}

}
/*
 * Scanner scanner = new Scanner(System.in);
 
int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
int guess;
int guessCount = 0;
 
System.out.println("--- Guess My Number Game ---");
 
do {
 
    System.out.print("\nGuess: ");
    guess = scanner.nextInt();
    guessCount++;
 
    if (guess < randomNumber) {
        System.out.println("HIGHER.");
    }
    else if (guess > randomNumber) {
        System.out.println("LOWER.");
    }
    else {
        System.out.println("CORRECT. My number was " + randomNumber + ".");
        System.out.println("You got it in " + guessCount + " guesses!");
    }
 
} while (guess != randomNumber);*/

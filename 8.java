import java.util.Scanner;
import java.util.Random;

public class min{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		
		int numGuesses = 0;
		int randomNumber = new Random().nextInt(10) + 1;
		
		System.out.println ("       *************       ");
		System.out.println ("Wlcome to the Guessing Game");
		System.out.println ("       *************       ");
		
		System.out.println ();
		
		System.out.println("Enter an int from 1 to 10:");
		int inputNumber = keyboard.nextInt();
		numGuesses++;
		
		while (inputNumber != randomNumber) {
			System.out.println();
			System.out.println("Try Again.....");
			System.out.println("Enter an int from 1 to 10: ");
			inputNumber = keyboard.nextInt();
			numGuesses++;
		}
		System.out.print(" You Win After ");
		System.out.println(numGuesses + "guesses.");
		
		keyboard.close();
	}
}
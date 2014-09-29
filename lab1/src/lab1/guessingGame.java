package lab1;

import java.util.*;
public class guessingGame {

	public static void main(String[] args) {
		Random rn = new Random();
		int answer = rn.nextInt(10) + 1;
		System.out.println("Guess a number between 1 and 10");
		Scanner in = new Scanner(System.in);
		int attempts = 0;
		
		while(true){
			attempts++;
			System.out.println("Attempt: " + attempts);
			int guess = in.nextInt();
			
			if(guess == answer){
				System.out.println("Correct, the answer is " + answer + " you have gambled and won!");
				break;
			}
			else{
				System.out.println("You are bad at guessing. Try again.");
			}	
		}
		
	}

}
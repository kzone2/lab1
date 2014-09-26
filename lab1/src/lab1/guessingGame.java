package lab1;

import java.util.*;
public class guessingGame {

	public static void main(String[] args) {
		Random rn = new Random();
		int answer = rn.nextInt(10) + 1;
		System.out.println("Guess a number between 1 and 10");
		Scanner in = new Scanner(System.in);
		
		int guess = in.nextInt();
		
		if(guess == answer){
			System.out.println("Correct, the answer is " + answer + " you have gambled and won!");
		}
		else{
			System.out.println("There are forces working against you and you suck at life. Goodbye");
		}	
		System.out.println("Done");
	}

}
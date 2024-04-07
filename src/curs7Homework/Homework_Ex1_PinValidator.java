package curs7Homework;

import java.util.Scanner;

public class Homework_Ex1_PinValidator {
	
	static Scanner scan = new Scanner(System.in);
	static int validPin = 2244;
	static int pinAttempts = 0;

	public static void main(String[] args) {
		
		atmPinValidator();
		
	}
	
	public static void atmPinValidator() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your PIN:");
		int enteredPin = scan.nextInt();
		pinAttempts++;
		
		while (enteredPin != validPin && pinAttempts < 3 ) {
			System.out.println("Wrong PIN");
			System.out.println("Enter your PIN:");
			enteredPin = scan.nextInt();
			pinAttempts++;
			}
		
		if (enteredPin == validPin) {
			System.out.println("Acces granted");
		} else if (pinAttempts >=3) {
			System.out.println("Maximum attempts reached. Card blocked");
		}
		
	}
	

}

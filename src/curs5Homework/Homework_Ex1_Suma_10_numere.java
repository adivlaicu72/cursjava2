package curs5Homework;

import java.util.Scanner;

public class Homework_Ex1_Suma_10_numere {
	


	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		for (int i = 1; i <= 10; i+=1 ) {
		System.out.println("Please enter number " +i +":");	
			
			sum += scan.nextInt();
		}
		scan.close();	
		System.out.println("The sum of the numbers is: " + sum);
		
	}

}


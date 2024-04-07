package curs6Homework;

import java.util.Scanner;

public class Homework_Ex2_While_Print_Numar_Inversat {

	static Scanner scan = new Scanner(System.in);
	static int numar = 0;
	static int invers= 0;
	static int cifra = 0;
	
	public static void main(String[] args) {
		printNumarInversat();
	}
	
	
	public static void printNumarInversat() {
		System.out.println("Introdu un numar:");
		
		numar = scan.nextInt();
		
		while(numar > 0){
			cifra = numar % 10;
			invers = invers*10 + cifra;
			numar = numar / 10;
		};
		
		System.out.println("Numarul inversat este: " +invers);
	}

}

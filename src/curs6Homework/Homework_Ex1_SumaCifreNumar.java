package curs6Homework;

import java.util.Scanner;

public class Homework_Ex1_SumaCifreNumar {
	
	static Scanner scan = new Scanner(System.in);
	static int numar=0;
	static int sumaCif=0;
	static int cifra = 0;

	public static void main(String[] args) {
		sumaCifre();

	}
	
	public static void sumaCifre() {
		System.out.println("Introdu un numar:");
		
		numar = scan.nextInt();
		
		do {
			cifra = numar % 10;
			sumaCif = sumaCif + cifra;
			numar = numar / 10;
		}while(numar > 0);
		
		System.out.println("Suma cifrelor este: " +sumaCif);
	}

}


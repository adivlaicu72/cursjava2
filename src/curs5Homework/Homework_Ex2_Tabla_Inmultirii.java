package curs5Homework;

import java.util.Scanner;

public class Homework_Ex2_Tabla_Inmultirii {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int n = scan.nextInt();
		scan.close();
		
		for(int i=0; i<10; i+=1) {
			System.out.println(n + " * " + (i+1) + " = " + (n * (i+1)));
		}	

	}

}
